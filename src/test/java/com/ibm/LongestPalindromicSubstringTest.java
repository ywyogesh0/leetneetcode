package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {
    @Test
    public void exampleTest() {
        String s = "babad";
        String res = LongestPalindromicSubstring.longestPalindrome(s);
        assertTrue(res.equals("bab") || res.equals("aba"));
    }
}
