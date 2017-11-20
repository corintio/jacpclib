package com.davidbaldin.ai.libs.acpc.model.procotol.acpc;

import com.davidbaldin.ai.libs.acpc.model.procotol.acpc.model.ServerResponse;
import org.junit.Test;

/**
 * Created by david.home on 18.11.17.
 */
public class ACPCParserTest {

    private static String EOF = "";

    @Test
    public void testDecoding1() {
        testDecoding("MATCHSTATE:1:31:r300r900c/r1800r3600r9000c/r20000c/:KsJs|JdTc/6dJc9c/Kh/Qc" + EOF);
    }

    @Test
    public void testDecoding2() {
        testDecoding("MATCHSTATE:1:31:r300r900c/r1800:|JdTc/6dJc9c" + EOF);
    }

    @Test
    public void testDecoding3() {
        testDecoding("MATCHSTATE:1:31::|JdTc" + EOF);
    }

    @Test
    public void testDecoding4() {
        testDecoding("MATCHSTATE:2:55:rcc/rfc/rc/rf:||AsTs/4cJh8h/Kd/8c" + EOF);
    }

    @Test
    public void testDecoding5() {
        testDecoding("MATCHSTATE:0:90:crfc/rc/rc/rc:Ad6h||Td2h/TsKd7h/Kh/6d" + EOF);
    }

    private void testDecoding(String encoded) {
        ACPCParser parser = new ACPCParser();
        System.out.println(encoded);
        ServerResponse response = parser.parseServerResponse(encoded);
        System.out.println(response);
    }
}
