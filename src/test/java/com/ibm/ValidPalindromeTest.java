package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidPalindromeTest {
    @Test
    public void exampleTest() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(ValidPalindrome.isPalindrome(s));
    }
}
