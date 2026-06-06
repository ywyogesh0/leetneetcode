package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class LongestCommonSubsequenceTest {
    @Test
    public void exampleTest() {
        assertEquals(4, LongestCommonSubsequence.lcs("ABCBDAB", "BDCABA"));
    }
}
