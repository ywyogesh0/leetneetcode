package com.leetneetcode.datastructures.topinterview150.greedy;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for the Knapsack problem.
 *
 */
public class KnapsackTest {

    @Test
    public void testSimpleCase() {
        int[] val = { 60, 100, 120 };
        int[] wt = { 10, 20, 30 };
        int W = 50;
        int expected = 220;
        assertEquals(expected, Knapsack.knapSack(W, wt, val, val.length));
    }

    @Test
    public void testZeroCapacity() {
        int[] val = { 1, 2, 3 };
        int[] wt = { 1, 1, 1 };
        int W = 0;
        int expected = 0;
        assertEquals(expected, Knapsack.knapSack(W, wt, val, val.length));
    }

    @Test
    public void testSingleItemTooHeavy() {
        int[] val = { 100 };
        int[] wt = { 5 };
        int W = 3;
        int expected = 0;
        assertEquals(expected, Knapsack.knapSack(W, wt, val, val.length));
    }

    @Test
    public void testSize11AllEqualWeight() {
        int[] val = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int[] wt = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int W = 10;
        int expected = 55;
        assertEquals(expected, Knapsack.knapSack(W, wt, val, val.length));
    }

    @Test
    public void testSize12MixedWeights() {
        int[] val = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24 };
        int[] wt = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 1 };
        int W = 20;
        int expected = 60;
        assertEquals(expected, Knapsack.knapSack(W, wt, val, val.length));
    }

    @Test
    public void testSize15AllOnes() {
        int[] val = new int[15];
        int[] wt = new int[15];
        for (int i = 0; i < 15; i++) {
            val[i] = i + 1;
            wt[i] = 1;
        }
        int W = 10;
        int expected = 55;
        assertEquals(expected, Knapsack.knapSack(W, wt, val, val.length));
    }

    @Test
    public void testSize20AllOnes() {
        int[] val = new int[20];
        int[] wt = new int[20];
        for (int i = 0; i < 20; i++) {
            val[i] = i + 1;
            wt[i] = 1;
        }
        int W = 20;
        int expected = 210;
        assertEquals(expected, Knapsack.knapSack(W, wt, val, val.length));
    }

    @Test
    public void testSize25AllOnes() {
        int[] val = new int[25];
        int[] wt = new int[25];
        for (int i = 0; i < 25; i++) {
            val[i] = i + 1;
            wt[i] = 1;
        }
        int W = 20;
        int expected = 210;
        assertEquals(expected, Knapsack.knapSack(W, wt, val, val.length));
    }

    @Test
    public void testSize30AllOnes() {
        int[] val = new int[30];
        int[] wt = new int[30];
        for (int i = 0; i < 30; i++) {
            val[i] = i + 1;
            wt[i] = 1;
        }
        int W = 25;
        int expected = 325;
        assertEquals(expected, Knapsack.knapSack(W, wt, val, val.length));
    }

    @Test
    public void testSize35AllOnes() {
        int[] val = new int[35];
        int[] wt = new int[35];
        for (int i = 0; i < 35; i++) {
            val[i] = i + 1;
            wt[i] = 1;
        }
        int W = 30;
        int expected = 465;
        assertEquals(expected, Knapsack.knapSack(W, wt, val, val.length));
    }

    @Test
    public void testSize40AllTwos() {
        int[] val = new int[40];
        int[] wt = new int[40];
        for (int i = 0; i < 40; i++) {
            val[i] = (i + 1) * 2;
            wt[i] = 1;
        }
        int W = 30;
        int expected = 930;
        assertEquals(expected, Knapsack.knapSack(W, wt, val, val.length));
    }

    @Test
    public void testSize50AllOnes() {
        int[] val = new int[50];
        int[] wt = new int[50];
        for (int i = 0; i < 50; i++) {
            val[i] = i + 1;
            wt[i] = 1;
        }
        int W = 40;
        int expected = 820;
        assertEquals(expected, Knapsack.knapSack(W, wt, val, val.length));
    }

    @Test
    public void testSize60AllOnes() {
        int[] val = new int[60];
        int[] wt = new int[60];
        for (int i = 0; i < 60; i++) {
            val[i] = i + 1;
            wt[i] = 1;
        }
        int W = 50;
        int expected = 1275;
        assertEquals(expected, Knapsack.knapSack(W, wt, val, val.length));
    }
}
