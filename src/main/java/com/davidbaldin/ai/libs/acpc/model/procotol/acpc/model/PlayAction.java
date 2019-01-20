package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model;

public class PlayAction {

    private Bet bet;

    private MatchState matchState;

    PlayAction() {

    }

    public PlayAction(MatchState matchState, Bet bet) {
        this.matchState = matchState;
        this.bet = bet;
    }

    public Bet getBet() {
        return bet;
    }

    public MatchState getMatchState() {
        return matchState;
    }

    public static PlayAction none() {
        return new NoPlayAction();
    }

    public static class NoPlayAction extends PlayAction {

    }
}
