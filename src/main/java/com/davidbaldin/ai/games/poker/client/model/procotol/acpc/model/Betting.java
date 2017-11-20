package com.davidbaldin.ai.games.poker.client.model.procotol.acpc.model;

/**
 * Created by david.home on 18.11.17.
 */
public class Betting {
    private BettingType type;
    private Long value = null;

    public BettingType getType() {
        return type;
    }

    public Long getValue() {
        return value;
    }

    public void setType(BettingType type) {
        this.type = type;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public boolean isNoLimit() {
        return value != null;
    }
}
