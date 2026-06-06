package com.leetneetcode.datastructures.topinterview150.greedy;

/**
 * Wrapper for Fractional Knapsack that accepts a single 2D `items` array.
 *
 * The first row `items[0]` represents values and the second row `items[1]`
 * represents weights.
 */
public class FractionalKnapsack2D {

    /**
     * Compute maximum achievable value for capacity `W` given a 2D `items`
     * array where row 0 = values and row 1 = weights.
     *
     * @param W     knapsack capacity
     * @param items 2D array with first row values and second row weights
     * @param n     number of items
     * @return maximum achievable value
     */
    public static int knapSack(int W, int[][] items, int n) {
        sortByProfitToWeight(items, n);
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (W - items[1][i] >= 0) {
                max = max + items[0][i];
                W = W - items[1][i];
            } else {
                max = max + (items[0][i] * W / items[1][i]);
                break;
            }
        }

        return max;
    }

    // Sorts items by profit-to-weight ratio in descending order, keeping values
    // aligned.
    private static void sortByProfitToWeight(int[][] items, int n) {
        for (int i = 0; i < n - 1; i++) {
            int temp = -1;
            double currentProfitToWeightRatio = items[0][i] / items[1][i];
            double nextProfitToWeightRatio = items[0][i + 1] / items[1][i + 1];

            if (currentProfitToWeightRatio < nextProfitToWeightRatio) {
                // swap weight(s)
                temp = items[1][i];
                items[1][i] = items[1][i + 1];
                items[1][i + 1] = temp;

                // swap value(s)
                temp = items[0][i];
                items[0][i] = items[0][i + 1];
                items[0][i + 1] = temp;
            }
        }
    }
}
