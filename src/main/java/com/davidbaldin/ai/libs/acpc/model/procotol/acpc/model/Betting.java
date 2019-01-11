package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model;

public class Betting {
    private BettingType type;
    private Long value = null;

    public BettingType getType() {
        return type;
    }

    public Betting setType(BettingType type) {
        this.type = type;
        return this;
    }

    public Long getValue() {
        return value;
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
        return "Betting{\n" +
                "\t type = " + type + "\n" +
                (isNoLimit() ? ("\t value = " + value + "\n") : "") +
                '}';
    }
}
