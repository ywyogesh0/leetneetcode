package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class MinimumWindowSubstringTest {
    @Test
    public void exampleTest() {
        assertEquals("BANC", MinimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
    }
}
