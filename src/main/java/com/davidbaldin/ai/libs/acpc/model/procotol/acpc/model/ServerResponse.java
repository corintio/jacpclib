package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model;

/**
 * Wrapper holding the match state and optionally additional encoding or server-related information.
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
        return "ServerResponse{\n" +
                "\tmatchState = " + matchState + "\n" +
                '}';
    }
}
