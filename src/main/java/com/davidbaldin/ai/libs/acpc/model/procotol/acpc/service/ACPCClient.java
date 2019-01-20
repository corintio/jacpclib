package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.service;

import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.MatchState;

public interface ACPCClient {
    void sendMatchState(MatchState matchState);
}
