package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidParenthesesTest {
    @Test
    public void exampleTest() {
        assertTrue(ValidParentheses.isValid("({[]})"));
        assertFalse(ValidParentheses.isValid("(]"));
    }
}
