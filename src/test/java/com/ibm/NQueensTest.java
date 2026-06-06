package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class NQueensTest {
    @Test
    public void exampleTest() {
        List<List<String>> sol = NQueens.solveNQueens(4);
        assertEquals(2, sol.size());
    }
}
