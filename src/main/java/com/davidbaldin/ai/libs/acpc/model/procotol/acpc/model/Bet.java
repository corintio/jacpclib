package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model;

public class Bet {
    private BetType type;
    private Long value = null;

    public BetType getType() {
        return type;
    }

    public Bet setType(BetType type) {
        this.type = type;
        return this;
    }

    public Long getValue() {
        return value;
    }

    public Bet setValue(Long value) {
        this.value = value;
        return this;
    }

    public boolean isNoLimit() {
        return value != null;
    }

    @Override
    public String toString() {
        return "Bet{\n" +
                "\t type = " + type + "\n" +
                (isNoLimit() ? ("\t value = " + value + "\n") : "") +
                '}';
    }
}
