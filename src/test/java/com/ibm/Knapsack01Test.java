package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class Knapsack01Test {
    @Test
    public void exampleTest() {
        int[] w = {1,3,4,5};
        int[] v = {1,4,5,7};
        assertEquals(9, Knapsack01.knapsack(7, w, v));
    }
}
