package com.leetneetcode.datastructures.topinterview150.greedy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the 2D-array wrapper of Fractional Knapsack where
 * `items[0]` = values and `items[1]` = weights.
 */
public class FractionalKnapsack2DTest {

    @Test
    public void testFractionalSelectionByProfitToWeightRatio() {
        int[][] items = { { 60, 100, 120 }, { 10, 20, 30 } };
        int W = 50;

        int expected = 240;
        assertEquals(expected, FractionalKnapsack2D.knapSack(W, items, 3));
    }

    @Test
    public void testFractionalSelectionWithPartialLastItem() {
        int[][] items = { { 100, 280, 120 }, { 10, 40, 20 } };
        int W = 45;

        int expected = 345;
        assertEquals(expected, FractionalKnapsack2D.knapSack(W, items, 3));
    }

    @Test
    public void testFractionalSelectionSinglePartialItem() {
        int[][] items = { { 100, 280, 120 }, { 10, 40, 20 } };
        int W = 35;

        int expected = 275;
        assertEquals(expected, FractionalKnapsack2D.knapSack(W, items, 3));
    }

    @Test
    public void testZeroCapacityReturnsZero() {
        int[][] items = { { 100, 280, 120 }, { 10, 40, 20 } };
        int W = 0;
        int expected = 0;
        assertEquals(expected, FractionalKnapsack2D.knapSack(W, items, 3));
    }
}
