package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class KMPTest {
    @Test
    public void exampleTest() {
        int[] matches = KMP.kmpSearch("AABAACAADAABAABA", "AABA");
        assertTrue(matches.length > 0);
        assertEquals(0, matches[0]);
    }
}
