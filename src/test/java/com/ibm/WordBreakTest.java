package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class WordBreakTest {
    @Test
    public void exampleTest() {
        List<String> dict = Arrays.asList("leet","code");
        assertTrue(WordBreak.wordBreak("leetcode", dict));
    }
}
