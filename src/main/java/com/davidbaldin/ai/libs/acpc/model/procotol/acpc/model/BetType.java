package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public enum BetType {
    FOLD("f"),
    CALL("c"),
    RAISE("r");

    private static Map<String, BetType> reverse = new HashMap<>();

    static {
        Stream.of(values()).forEach(betType -> reverse.put(betType.id, betType));
    }

    private final String id;

    BetType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static BetType fromId(String id) {
        return reverse.get(id);
    }

    @Override
    public String toString() {
        return name();
    }
}
