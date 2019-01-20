package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model;

public interface Player {
    PlayAction onGameAction(MatchState matchState);
}
