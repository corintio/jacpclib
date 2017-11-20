package com.davidbaldin.ai.games.poker.client.model.procotol.acpc.antlr;

import com.davidbaldin.ai.games.poker.client.model.procotol.acpc.model.MatchState;
import com.davidbaldin.ai.games.poker.client.model.procotol.acpc.model.ServerResponse;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.log4j.Logger;

import java.util.Optional;

/**
 * Created by david.home on 19.11.17.
 */
public class ACPC2017TokenListener extends ACPC2017BaseListener {

    final static Logger LOGGER = Logger.getLogger(ACPC2017TokenListener.class);

    private ServerResponse serverResponse;

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

    @Override
    public void exitBetting(ACPC2017Parser.BettingContext ctx) {
        Optional.ofNullable(ctx).map(ParserRuleContext::getStop).ifPresent(token -> {
            try {
                LOGGER.info("betting : '" + token.getText() + "'");
            } catch (NumberFormatException e) {

            }
        });
    }

    @Override
    public void exitBoard_cards(ACPC2017Parser.Board_cardsContext ctx) {
        Optional.ofNullable(ctx).map(ParserRuleContext::getStop).ifPresent(token -> {
            try {
                LOGGER.info("board cards : '" + token.getText() + "'");
            } catch (NumberFormatException e) {

            }
        });
    }

    @Override
    public void exitCards(ACPC2017Parser.CardsContext ctx) {
        Optional.ofNullable(ctx).map(ParserRuleContext::getStop).ifPresent(token -> {
            try {
                LOGGER.info("cards : '" + token.getText() + "'");
            } catch (NumberFormatException e) {

            }
        });
    }

    @Override
    public void exitHole_cards(ACPC2017Parser.Hole_cardsContext ctx) {
        Optional.ofNullable(ctx).map(ParserRuleContext::getStop).ifPresent(token -> {
            try {
                LOGGER.info("hole cards : '" + token.getText() + "'");
            } catch (NumberFormatException e) {

            }
        });
    }

    @Override
    public void exitPlayerx_cards(ACPC2017Parser.Playerx_cardsContext ctx) {
        Optional.ofNullable(ctx).map(ParserRuleContext::getStop).ifPresent(token -> {
            try {
                LOGGER.info("player x cards : '" + token.getText() + "'");
            } catch (NumberFormatException e) {

            }
        });
    }

    @Override
    public void exitRaise_value(ACPC2017Parser.Raise_valueContext ctx) {
        Optional.ofNullable(ctx).map(ParserRuleContext::getStop).ifPresent(token -> {
            try {
                LOGGER.info("raise value : '" + token.getText() + "'");
            } catch (NumberFormatException e) {

            }
        });
    }

    @Override
    public void enterRound_x_betting(ACPC2017Parser.Round_x_bettingContext ctx) {
        Optional.ofNullable(ctx).map(ParserRuleContext::getStop).ifPresent(token -> {
            try {
                LOGGER.info("round x betting : '" + token.getText() + "'");
            } catch (NumberFormatException e) {

            }
        });
    }

    @Override
    public void exitRoundx_board_cards(ACPC2017Parser.Roundx_board_cardsContext ctx) {
        Optional.ofNullable(ctx).map(ParserRuleContext::getStop).ifPresent(token -> {
            try {
                LOGGER.info("round x board cards : '" + token.getText() + "'");
            } catch (NumberFormatException e) {

            }
        });
    }

    public ServerResponse getServerResponse() {
        return serverResponse;
    }
}
