package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class LetterCombinationsTest {
    @Test
    public void exampleTest() {
        List<String> res = LetterCombinations.letterCombinations("23");
        assertEquals(9, res.size());
    }
}
