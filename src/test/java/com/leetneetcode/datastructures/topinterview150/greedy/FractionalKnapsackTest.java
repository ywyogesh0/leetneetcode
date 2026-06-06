package com.leetneetcode.datastructures.topinterview150.greedy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the Fractional Knapsack problem using profit-to-weight ratio
 * selection.
 */
public class FractionalKnapsackTest {

    @Test
    public void testFractionalSelectionByProfitToWeightRatio() {
        int[] val = { 60, 100, 120 };
        int[] wt = { 10, 20, 30 };
        int W = 50;

        // Profit-to-weight ratios are [6.0, 5.0, 4.0]
        // Take items 0 and 1 fully for 160 value, then take 2/3 of item 2 for 80 value.
        int expected = 240;
        assertEquals(expected, FractionalKnapsack.knapSack(W, wt, val, val.length));
    }

    @Test
    public void testFractionalSelectionWithPartialLastItem() {
        int[] val = { 100, 280, 120 };
        int[] wt = { 10, 40, 20 };
        int W = 45;

        // Profit-to-weight ratios are [10.0, 7.0, 6.0]
        // Take item 0 fully, then take 35/40 of item 1.
        // Value = 100 + 280 * (35/40) = 100 + 245 = 345
        int expected = 345;
        assertEquals(expected, FractionalKnapsack.knapSack(W, wt, val, val.length));
    }

    @Test
    public void testFractionalSelectionSinglePartialItem() {
        int[] val = { 100, 280, 120 };
        int[] wt = { 10, 40, 20 };
        int W = 35;

        // Profit-to-weight ratios are [10.0, 7.0, 6.0]
        // Take item 0 fully, then take 25/40 of item 1.
        // Value = 100 + 280 * (25/40) = 100 + 175 = 275
        int expected = 275;
        assertEquals(expected, FractionalKnapsack.knapSack(W, wt, val, val.length));
    }

    @Test
    public void testZeroCapacityReturnsZero() {
        int[] val = { 100, 280, 120 };
        int[] wt = { 10, 40, 20 };
        int W = 0;
        int expected = 0;
        assertEquals(expected, FractionalKnapsack.knapSack(W, wt, val, val.length));
    }
}
