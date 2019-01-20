package com.davidbaldin.ai.libs.acpc.model.procotol.acpc.service.impl;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.net.InetSocketAddress;

import org.checkerframework.checker.nullness.qual.NonNull;

import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.ACPCDecoderEncoder;
import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.Player;

import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.reactivex.netty.protocol.tcp.server.TcpServer;
import rx.Observable;

public class ACPCClientImpl {

    private final InetSocketAddress socketAddress;
    private final Player player;

    private ACPCDecoderEncoder acpcDecoderEncoder = new ACPCDecoderEncoder();

    public ACPCClientImpl(@NonNull String serverIP, int serverPort, @NonNull Player player) {
        this.socketAddress = new InetSocketAddress(serverIP, serverPort);
        this.player = player;
    }

    public void connect() {
        TcpServer.newServer(socketAddress)
                .<String, String>pipelineConfigurator(pipeline -> {
                    pipeline.addLast(new LineBasedFrameDecoder(1024));
                    pipeline.addLast(new StringDecoder(UTF_8));
                })
                .start(connection -> {
                    Observable<String> map = connection.getInput()
                            .map(acpcDecoderEncoder::decode)
                            .map(player::onGameAction)
                            .map(acpcDecoderEncoder::encode);
                    return connection.writeAndFlushOnEach(map);
                })
                .awaitShutdown();
    }

}
