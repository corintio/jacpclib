package com.davidbaldin.ai.libs.acpc.model.procotol.acpc;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.ServerResponse;

@RunWith(Theories.class)
public class ACPCParserTest {

    private static String EOF = "";

    public static @DataPoints String[] candidates = {
            "MATCHSTATE:0:0::TdAs| ",
            "MATCHSTATE:0:0:r:TdAs| ",
            "MATCHSTATE:0:0:rr:TdAs| ",
            "MATCHSTATE:0:0:rrc/:TdAs|/2c8c3h ",
            "MATCHSTATE:0:0:rrc/r:TdAs|/2c8c3h ",
            "MATCHSTATE:0:0:rrc/rc/:TdAs|/2c8c3h/9c ",
            "MATCHSTATE:0:0:rrc/rc/c:TdAs|/2c8c3h/9c ",
            "MATCHSTATE:0:0:rrc/rc/cr:TdAs|/2c8c3h/9c ",
            "MATCHSTATE:0:0:rrc/rc/crc/:TdAs|/2c8c3h/9c/Kh ",
            "MATCHSTATE:0:0:rrc/rc/crc/c:TdAs|/2c8c3h/9c/Kh ",
            "MATCHSTATE:0:0:rrc/rc/crc/cr:TdAs|/2c8c3h/9c/Kh ",
            "MATCHSTATE:0:0:rrc/rc/crc/crc:TdAs|8hTc/2c8c3h/9c/Kh ",
            "MATCHSTATE:1:1::|Qd7c ",
            "MATCHSTATE:1:1:r:|Qd7c ",
            "MATCHSTATE:1:1:rr:|Qd7c ",
            "MATCHSTATE:1:1:rrc/:|Qd7c/2h8h5c ",
            "MATCHSTATE:1:1:rrc/r:|Qd7c/2h8h5c ",
            "MATCHSTATE:1:1:rrc/rc/:|Qd7c/2h8h5c/Th ",
            "MATCHSTATE:1:1:rrc/rc/r:|Qd7c/2h8h5c/Th ",
            "MATCHSTATE:1:1:rrc/rc/rf:|Qd7c/2h8h5c/Th ",
            "MATCHSTATE:0:2::9d7s| ",
            "MATCHSTATE:0:2:r:9d7s| ",
            "MATCHSTATE:0:2:rc/:9d7s|/5d2cJc ",
            "MATCHSTATE:0:2:rc/c:9d7s|/5d2cJc ",
            "MATCHSTATE:0:2:rc/cc/:9d7s|/5d2cJc/3d ",
            "MATCHSTATE:0:2:rc/cc/c:9d7s|/5d2cJc/3d ",
            "MATCHSTATE:0:2:rc/cc/cr:9d7s|/5d2cJc/3d ",
            "MATCHSTATE:0:2:rc/cc/crf:9d7s|/5d2cJc/3d ",
            "MATCHSTATE:0:30::9s8h| ",
            "MATCHSTATE:0:30:c:9s8h| ",
            "MATCHSTATE:0:30:cc/:9s8h|/8c8d5c ",
            "MATCHSTATE:0:30:cc/r250:9s8h|/8c8d5c ",
            "MATCHSTATE:0:30:cc/r250c/:9s8h|/8c8d5c/6s ",
            "MATCHSTATE:0:30:cc/r250c/r500:9s8h|/8c8d5c/6s ",
            "MATCHSTATE:0:30:cc/r250c/r500c/:9s8h|/8c8d5c/6s/2d ",
            "MATCHSTATE:0:30:cc/r250c/r500c/r1250:9s8h|/8c8d5c/6s/2d ",
            "MATCHSTATE:0:30:cc/r250c/r500c/r1250c:9s8h|9c6h/8c8d5c/6s/2d ",
            "MATCHSTATE:1:31::|JdTc ",
            "MATCHSTATE:1:31:r300:|JdTc ",
            "MATCHSTATE:1:31:r300r900:|JdTc ",
            "MATCHSTATE:1:31:r300r900c/:|JdTc/6dJc9c ",
            "MATCHSTATE:1:31:r300r900c/r1800:|JdTc/6dJc9c ",
            "MATCHSTATE:1:31:r300r900c/r1800r3600:|JdTc/6dJc9c ",
            "MATCHSTATE:1:31:r300r900c/r1800r3600r9000:|JdTc/6dJc9c ",
            "MATCHSTATE:1:31:r300r900c/r1800r3600r9000c/:|JdTc/6dJc9c/Kh ",
            "MATCHSTATE:1:31:r300r900c/r1800r3600r9000c/r20000:|JdTc/6dJc9c/Kh ",
            "MATCHSTATE:1:31:r300r900c/r1800r3600r9000c/r20000c/:KsJs|JdTc/6dJc9c/Kh/Qc ",
            "MATCHSTATE:2:55::||AsTs ",
            "MATCHSTATE:2:55:r:||AsTs ",
            "MATCHSTATE:2:55:rc:||AsTs ",
            "MATCHSTATE:2:55:rcc/:||AsTs/4cJh8h ",
            "MATCHSTATE:2:55:rcc/r:||AsTs/4cJh8h ",
            "MATCHSTATE:2:55:rcc/rf:||AsTs/4cJh8h ",
            "MATCHSTATE:2:55:rcc/rfc/:||AsTs/4cJh8h/Kd ",
            "MATCHSTATE:2:55:rcc/rfc/r:||AsTs/4cJh8h/Kd ",
            "MATCHSTATE:2:55:rcc/rfc/rc/:||AsTs/4cJh8h/Kd/8c ",
            "MATCHSTATE:2:55:rcc/rfc/rc/r:||AsTs/4cJh8h/Kd/8c ",
            "MATCHSTATE:2:55:rcc/rfc/rc/rf:||AsTs/4cJh8h/Kd/8c ",
            "MATCHSTATE:0:90::Ad6h|| ",
            "MATCHSTATE:0:90:c:Ad6h|| ",
            "MATCHSTATE:0:90:cr:Ad6h|| ",
            "MATCHSTATE:0:90:crf:Ad6h|| ",
            "MATCHSTATE:0:90:crfc/:Ad6h||/TsKd7h ",
            "MATCHSTATE:0:90:crfc/r:Ad6h||/TsKd7h ",
            "MATCHSTATE:0:90:crfc/rc/:Ad6h||/TsKd7h/Kh ",
            "MATCHSTATE:0:90:crfc/rc/r:Ad6h||/TsKd7h/Kh ",
            "MATCHSTATE:0:90:crfc/rc/rc/:Ad6h||/TsKd7h/Kh/6d ",
            "MATCHSTATE:0:90:crfc/rc/rc/r:Ad6h||/TsKd7h/Kh/6d ",
            "MATCHSTATE:0:90:crfc/rc/rc/rc:Ad6h||Td2h/TsKd7h/Kh/6d " };

    @Theory
    public void testDecoding(String encoded) {
        ACPCParser parser = new ACPCParser();
        System.out.println(encoded);
        ServerResponse response = parser.parseServerResponse(encoded);
        System.out.println(response);
    }
}
