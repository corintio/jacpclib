package com.davidbaldin.ai.games.poker.client.model.procotol.acpc;

import com.davidbaldin.ai.games.poker.client.model.procotol.acpc.antlr.ACPC2017Lexer;
import com.davidbaldin.ai.games.poker.client.model.procotol.acpc.antlr.ACPC2017Parser;
import com.davidbaldin.ai.games.poker.client.model.procotol.acpc.antlr.ACPC2017TokenListener;
import com.davidbaldin.ai.games.poker.client.model.procotol.acpc.model.ServerResponse;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Created by david.home on 17.11.17.
 */
public class ACPCParser {

    public ServerResponse parseServerResponse(String encodedServerResponse) {
        return encode(encodedServerResponse);
    }

    private ServerResponse encode(String encodedResponse) {

        ACPC2017TokenListener listener = new ACPC2017TokenListener();

        ACPC2017Lexer lexer = new ACPC2017Lexer(CharStreams.fromString(encodedResponse));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ACPC2017Parser parser = new ACPC2017Parser(tokenStream);
        ACPC2017Parser.Server_responseContext parserRuleContext = parser.server_response();

        ParseTreeWalker.DEFAULT.walk(listener, parserRuleContext);

        return listener.getServerResponse();
    }


}
