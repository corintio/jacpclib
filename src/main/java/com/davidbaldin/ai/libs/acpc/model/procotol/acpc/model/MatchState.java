package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model;

import java.util.Collections;
import java.util.List;

/**
 * Created by david.home on 18.11.17.
 */
public class MatchState {
    private int position = 0;
    private int handNumber = 0;
    /**
     * {@link List#indexOf(Object)} is the round
     */
    private List<Betting> bettings = Collections.emptyList();
    private List<Card> holeCards = Collections.emptyList();
    private List<Card> boardCards = Collections.emptyList();

    public int getHandNumber() {
        return handNumber;
    }

    public void setHandNumber(int handNumber) {
        this.handNumber = handNumber;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public List<Betting> getBettings() {
        return bettings;
    }

    public List<Card> getBoardCards() {
        return boardCards;
    }

    public List<Card> getHoleCards() {
        return holeCards;
    }

    @Override
    public String toString() {
        return "MatchState{" +
                "position=" + position +
                ", handNumber=" + handNumber +
                ", bettings=" + bettings +
                ", holeCards=" + holeCards +
                ", boardCards=" + boardCards +
                '}';
    }
}
