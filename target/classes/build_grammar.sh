#!/usr/bin/env bash

export CLASSPATH=".:/usr/local/lib/antlr-4.7-complete.jar:$CLASSPATH"
# alias antlr4='java -jar /usr/local/lib/antlr-4.7-complete.jar'
# alias grun='java org.antlr.v4.gui.TestRig'
java -jar /usr/local/lib/antlr-4.7-complete.jar ACPC2017.g4 -no-visitor -listener -package com.davidbaldin.ai.games.poker.client.model.procotol.acpc.antlr
mv *.java ../java/com/davidbaldin/ai/games/poker/client/model/procotol/acpc/antlr