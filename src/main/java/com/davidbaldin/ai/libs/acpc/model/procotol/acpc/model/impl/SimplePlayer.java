package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.Bet;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.BetType;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.MatchState;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.PlayAction;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.Player;

public class SimplePlayer implements Player {
    private int playerId = 0;

    private static Map<BetType, Float> probs = new HashMap<>();

    static {
        probs.put(BetType.FOLD, 0.06f);
        probs.put(BetType.CALL, (1.0f - probs.get(BetType.FOLD)) * 0.5f);
        probs.put(BetType.RAISE, (1.0f - probs.get(BetType.FOLD)) * 0.5f);
    }

    private Long min = 0l;
    private Long max = 0l;

    @Override
    public PlayAction onGameAction(MatchState matchState) {

        if (stateFinished(matchState)) {
            /* none the game over message */
            return PlayAction.none();
        }

        if (currentPlayer(matchState) != playerId) {
            /* we're not acting */
            return PlayAction.none();
        }

        Bet potentialBet;
        float prob = 0f;

        Map<BetType, Float> actionProbs = new HashMap<>();

        Arrays.stream(BetType.values()).forEach(betType -> actionProbs.put(betType, 0.0f));

        /* consider fold */
        potentialBet.setType(BetType.FOLD);
        potentialBet.setValue(0l);

        if (isValidAction(matchState, potentialBet)) {
            actionProbs.put(BetType.FOLD, probs.get(BetType.FOLD));
            prob += probs.get(BetType.FOLD);
        }

        /* consider call */

        potentialBet.setType(BetType.CALL);
        potentialBet.setValue(0l);

        actionProbs.put(BetType.CALL, probs.get(BetType.CALL));
        prob += probs.get(BetType.CALL);

        /* consider raise */
        if (raiseIsValid(matchState, min, max)) {
            actionProbs.put(BetType.RAISE, probs.get(BetType.RAISE));
            prob += probs.get(BetType.RAISE);
        }

        /* normalise the probs  */
        assert (prob > 0.0);
        Arrays.stream(BetType.values()).forEach(betType -> actionProbs.put(betType, actionProbs.get(actionProbs) / prob));

        /* choose one of the valid actions at random */
        double p = Math.random();
        BetType a = null;
        double value = 0l;
        for (int i = 0; i < BetType.values().length; i++) {
            a = BetType.values()[i];
            if (p <= actionProbs.get(a)) {
                break;
            }
            p -= actionProbs.get(a);
        }
        if (a == BetType.RAISE) {
            value = (Math.random() * ((max - min) + 1)) + min;
        }

        /* do the action! */
        assert (isValidAction(game, & state.state,0, &action ) );
        r = printAction(game, & action, MAX_LINE_LEN - len - 2,
		     &line[len] );
        if (r < 0) {

            fprintf(stderr, "ERROR: line too long after printing action\n");
            exit(EXIT_FAILURE);
        }
    }

    private boolean isValidAction(MatchState matchState, Bet potentialBet) {
        return false;
    }


    private boolean raiseIsValid(MatchState matchState, Long min, Long max) {
        return false;
    }

    private int currentPlayer(MatchState matchState) {
        return 0;
    }

    private boolean stateFinished(MatchState matchState) {
        return false;
    }
}
