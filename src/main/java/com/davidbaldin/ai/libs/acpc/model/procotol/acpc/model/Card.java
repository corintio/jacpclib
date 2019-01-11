package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public enum Card {

    _2S("2s"),
    _2H("2h"),
    _2D("2d"),
    _2C("2c"),
    _3S("3s"),
    _3H("3h"),
    _3D("3d"),
    _3C("3c"),
    _4S("4s"),
    _4H("4h"),
    _4D("4d"),
    _4C("4c"),
    _5S("5s"),
    _5H("5h"),
    _5D("5d"),
    _5C("5c"),
    _6S("6s"),
    _6H("6h"),
    _6D("6d"),
    _6C("6c"),
    _7S("7s"),
    _7H("7h"),
    _7D("7d"),
    _7C("7c"),
    _8S("8s"),
    _8H("8h"),
    _8D("8d"),
    _8C("8c"),
    _9S("9s"),
    _9H("9h"),
    _9D("9d"),
    _9C("9c"),
    _TS("Ts"),
    _TH("Th"),
    _TD("Td"),
    _TC("Tc"),
    _JS("Js"),
    _JH("Jh"),
    _JD("Jd"),
    _JC("Jc"),
    _QS("Qs"),
    _QH("Qh"),
    _QD("Qd"),
    _QC("Qc"),
    _KS("Ks"),
    _KH("Kh"),
    _KD("Kd"),
    _KC("Kc"),
    _AS("As"),
    _AH("Ah"),
    _AD("Ad"),
    _AC("Ac");

    private static Map<String, Card> reverse = new HashMap<>();

    static {
        Stream.of(values()).forEach(type -> reverse.put(type.id, type));
    }

    private final String id;

    Card(String id) {
        this.id = id;
    }

    public static Card fromId(String id) {
        return reverse.get(id);
    }

    public String getId() {
        return id;
    }
}
