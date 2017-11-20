package com.davidbaldin.ai.games.poker.client.model.procotol.acpc.model;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by david.home on 18.11.17.
 */
public enum BettingType {
    FOLD("f"),
    CALL("c"),
    RAISE("r");

    private final String id;

    private static Map<String, BettingType> reverse = new HashMap<>();

    static {
        Stream.of(values()).forEach(bettingType -> reverse.put(bettingType.id, bettingType));
    }

    BettingType(String id) {
        this.id = id;
    }

    public static BettingType fromId(String id) {
        return reverse.get(id);
    }
}
