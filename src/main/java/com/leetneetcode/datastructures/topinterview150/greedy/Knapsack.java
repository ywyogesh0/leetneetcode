package com.leetneetcode.datastructures.topinterview150.greedy;

/**
 * 0/1 Knapsack problem implementation.
 * 
 */
public class Knapsack {

    /**
     * Implements the 0/1 knapsack optimal solution.
     *
     * @param W   the maximum capacity of the knapsack
     * @param wt  array of item weights
     * @param val array of item values
     * @param n   number of items
     * @return maximum achievable value
     */
    public static int knapSack(int W, int[] wt, int[] val, int n) {
        sortByWeight(wt, val, n);
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (W - wt[i] >= 0) {
                max = max + val[i];
                W = W - wt[i];
            }
        }

        return max;
    }

    // Sorts items by weight in descending order (and value accordingly)
    private static void sortByWeight(int[] wt, int[] val, int n) {
        for (int i = 0; i < n - 1; i++) {
            int temp = -1;
            if (wt[i] < wt[i + 1]) {
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
