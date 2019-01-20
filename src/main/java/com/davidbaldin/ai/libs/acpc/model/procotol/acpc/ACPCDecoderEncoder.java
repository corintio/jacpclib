package com.davidbaldin.ai.libs.acpc.model.procotol.acpc;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.checkerframework.checker.nullness.qual.NonNull;

import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.antlr.ACPC2017Lexer;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.antlr.ACPC2017Parser;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.antlr.ACPC2017TokenListener;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.Bet;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.BetType;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.Card;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.MatchState;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.PlayAction;

public class ACPCDecoderEncoder {

    public String encode(@NonNull PlayAction playAction) {
        if (PlayAction.NoPlayAction.class.isInstance(playAction)) {
            return "\n";
        }
        return encode(playAction.getMatchState()) + ":" + encode(playAction.getBet());
    }

    public String encode(@NonNull Bet bet) {
        Long betValue = bet.getValue();
        return bet.getType().getId() + (betValue != null && betValue > 0 ? betValue : "");
    }

    /**
     * TODO finalize decoder!
     */
    public String encode(@NonNull MatchState matchState) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        pw.print("MATCHSTATE:");
        pw.print(matchState.getPosition());
        pw.print(":");
        pw.print(matchState.getHandNumber());
        pw.print(":");
        for (List<Bet> betsPerRound : matchState.getBets().values()) {
            for (Bet bet : betsPerRound) {
                BetType type = bet.getType();
                if (type == null) {
                    continue;
                }
                pw.print(type.getId());
                Long betValue = bet.getValue();
                if (betValue != null && betValue > 0) {
                    pw.print(betValue);
                }
            }
            pw.print("/");
        }
        pw.print(":");
        for (Card card : matchState.getHoleCards()) {
            pw.print(card.getId());
        }
        pw.print("|");

        Iterator<List<Card>> boardCardsIter = matchState.getBoardCards().values().iterator();
        List<Card> roundCards = null;
        while (boardCardsIter.hasNext() && (roundCards = boardCardsIter.next()) != null) {
            for (Card card : roundCards) {
                pw.print(card.getId());
            }
            if (boardCardsIter.hasNext()) {
                pw.print("/");
            }
        }
        return sw.toString();
    }

    public MatchState decode(@NonNull String matchStateEncoded) {
        ACPC2017TokenListener listener = new ACPC2017TokenListener();
        ACPC2017Lexer lexer = new ACPC2017Lexer(CharStreams.fromString(matchStateEncoded));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ACPC2017Parser parser = new ACPC2017Parser(tokenStream);
        ACPC2017Parser.Server_responseContext parserRuleContext = parser.server_response();

        ParseTreeWalker.DEFAULT.walk(listener, parserRuleContext);
        return listener.getServerResponse().getMatchState();
    }
}
