package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model;

public class Betting {
    private BettingType type;
    private Long value = null;

    public BettingType getType() {
        return type;
    }

    public Long getValue() {
        return value;
    }

    public Betting setType(BettingType type) {
        this.type = type;
        return this;
    }

    public Betting setValue(Long value) {
        this.value = value;
        return this;
    }

    public boolean isNoLimit() {
        return value != null;
    }

    @Override
    public String toString() {
        return "Betting{" +
                "type=" + type +
                (isNoLimit() ? (", value=" + value) : "") +
                '}';
    }
}
