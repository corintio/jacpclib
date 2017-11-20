package com.davidbaldin.ai.games.poker.client.model.procotol.acpc.model;

/**
 * Created by david.home on 18.11.17.
 */
public class ServerResponse {
    private MatchState matchState = new MatchState();

    public MatchState getMatchState() {
        return matchState;
    }

    public void setMatchState(MatchState matchState) {
        this.matchState = matchState;
    }

    @Override
    public String toString() {
        return "ServerResponse{" +
                "matchState=" + matchState +
                '}';
    }
}
