package com.leetneetcode.datastructures.topinterview150.greedy;

import java.util.Arrays;

/**
 * Fractional Knapsack problem implementation.
 * 
 */
public class FractionalKnapsack {

    /**
     * Implements the fractional knapsack optimal solution.
     *
     * @param W   the maximum capacity of the knapsack
     * @param wt  array of item weights
     * @param val array of item values
     * @param n   number of items
     * @return maximum achievable value
     */
    public static int knapSack(int W, int[] wt, int[] val, int n) {
        sortByProfitToWeight(wt, val, n);
        System.out.println("Sorted weights: " + Arrays.toString(wt));
        System.out.println("Sorted values: " + Arrays.toString(val));
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (W - wt[i] >= 0) {
                max = max + val[i];
                W = W - wt[i];
            } else {
                max = max + (val[i] * W / wt[i]);
                break;
            }
        }

        return max;
    }

    // Sorts items by profit-to-weight ratio in descending order, keeping values
    // aligned.
    private static void sortByProfitToWeight(int[] wt, int[] val, int n) {
        for (int i = 0; i < n - 1; i++) {
            int temp = -1;
            double currentProfitToWeightRatio = val[i] / wt[i];
            double nextProfitToWeightRatio = val[i + 1] / wt[i + 1];

            if (currentProfitToWeightRatio < nextProfitToWeightRatio) {
                // swap weight(s)
                temp = wt[i];
                wt[i] = wt[i + 1];
                wt[i + 1] = temp;

                // swap value(s)
                temp = val[i];
                val[i] = val[i + 1];
                val[i + 1] = temp;
            }
        }
    }
}
