package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.antlr;

import java.util.Optional;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.log4j.Logger;

import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.Betting;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.BettingType;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.Card;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.MatchState;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.ServerResponse;

public class ACPC2017TokenListener extends ACPC2017BaseListener {

    final static Logger LOGGER = Logger.getLogger(ACPC2017TokenListener.class);

    private ServerResponse serverResponse;

    private int currentBetRound = 0;

    private int currentBoardCardRound = 0;

    @Override
    public void enterServer_response(ACPC2017Parser.Server_responseContext ctx) {
        LOGGER.info("server state");
        this.serverResponse = Optional.ofNullable(ctx).map(ParserRuleContext::getStart).map(token -> new ServerResponse()).orElse(null);
    }

    @Override
    public void enterMatch_state(ACPC2017Parser.Match_stateContext ctx) {
        LOGGER.info("match state");
        this.serverResponse.setMatchState(new MatchState());
    }

    @Override
    public void exitAction_call(ACPC2017Parser.Action_callContext ctx) {
        addBetting(ctx);
    }

    @Override
    public void exitAction_fold(ACPC2017Parser.Action_foldContext ctx) {
        addBetting(ctx);
    }

    @Override
    public void exitAction_raise(ACPC2017Parser.Action_raiseContext ctx) {
        addBetting(ctx);
    }

    private void addBetting(ParserRuleContext ctx) {
        Optional.ofNullable(ctx).map(ParserRuleContext::getStop).map(Token::getText).map(BettingType::fromId)
                .ifPresent(bettingType -> {
                    LOGGER.info("round[" + currentBetRound + "] action : '" + bettingType + "'");
                    serverResponse.getMatchState().addBetting(currentBetRound, new Betting().setType(bettingType));
                });
    }

    @Override
    public void exitAction_raise_value(ACPC2017Parser.Action_raise_valueContext ctx) {
        Optional.ofNullable(ctx).map(ACPC2017Parser.Action_raise_valueContext::RAISE).map(TerminalNode::getText).map(BettingType::fromId)
                .ifPresent(bettingType -> {
                    LOGGER.info("round[" + currentBetRound + "] action : '" + bettingType + "'");
                    final Betting betting = new Betting().setType(bettingType);
                    Optional.ofNullable(ctx.raise_value()).map(RuleContext::getText).ifPresent(raiseValueText -> {
                        try {
                            long raiseValue = Long.parseUnsignedLong(raiseValueText);
                            betting.setValue(raiseValue);
                            LOGGER.info("raise value : '" + raiseValue + "'");
                        } catch (NumberFormatException e) {

                        }
                    });
                    serverResponse.getMatchState().addBetting(currentBetRound, betting);
                });
    }

    @Override
    public void enterRound_x_betting(ACPC2017Parser.Round_x_bettingContext ctx) {
        Optional.ofNullable(ctx).map(ParserRuleContext::getStop).ifPresent(token -> {
            currentBetRound++;
        });
    }

    @Override
    public void enterRoundx_board_cards(ACPC2017Parser.Roundx_board_cardsContext ctx) {
        Optional.ofNullable(ctx).map(ParserRuleContext::getStop).ifPresent(token -> {
            currentBoardCardRound++;
        });
    }

    @Override
    public void exitRound_card(ACPC2017Parser.Round_cardContext ctx) {
        Optional.ofNullable(ctx).map(ParserRuleContext::getStop).map(Token::getText).map(Card::fromId).ifPresent(card -> {
            LOGGER.info("round[" + currentBetRound + "] card: '" + card + "'");
            this.serverResponse.getMatchState().addBoardCard(currentBoardCardRound, card);

        });
    }

    @Override
    public void exitPlayer_card(ACPC2017Parser.Player_cardContext ctx) {
        Optional.ofNullable(ctx).map(ParserRuleContext::getStop).map(Token::getText).map(Card::fromId).ifPresent(card -> {
            this.serverResponse.getMatchState().addHoleCard(card);
        });
    }

    @Override
    public void exitHand_number(ACPC2017Parser.Hand_numberContext ctx) {
        Optional.ofNullable(ctx).map(ParserRuleContext::getStop).ifPresent(token -> {
            try {
                int value = Integer.parseUnsignedInt(token.getText());
                this.serverResponse.getMatchState().setHandNumber(value);
                LOGGER.info("hand number : '" + value + "'");
            } catch (NumberFormatException e) {

            }
        });
    }

    @Override
    public void exitPosition(ACPC2017Parser.PositionContext ctx) {
        Optional.ofNullable(ctx).map(ParserRuleContext::getStop).ifPresent(token -> {
            try {
                int value = Integer.parseUnsignedInt(token.getText());
                this.serverResponse.getMatchState().setPosition(value);
                LOGGER.info("position : '" + value + "'");
            } catch (NumberFormatException e) {

            }
        });
    }

    public ServerResponse getServerResponse() {
        return serverResponse;
    }
}
