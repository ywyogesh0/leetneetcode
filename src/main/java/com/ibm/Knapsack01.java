package com.ibm;

/**
 * Problem 23: 0/1 Knapsack
 *
 * Input: arrays of weights and values, and knapsack capacity W.
 * Output: maximum total value that fits within capacity.
 * Example: weights=[1,3,4], values=[15,20,30], W=4 -> 35
 *
 * Approach: dynamic programming (DP table) or optimized 1D DP for capacity iteration.
 *
 * Visual Illustration (weights=[1,3,4], values=[15,20,30], W=4):
 * 1) DP table rows for items, columns for capacities 0..4
 * 2) after processing item1(weight1,val15): best at cap4 =15
 * 3) after item2(weight3,val20): best at cap4 = max(15,20)=20
 * 4) after item3(weight4,val30): best at cap4 = max(20,30)=30 or combine 1+3 -> 35 when allowed
 */
public class Knapsack01 {
    public static int knapsack(int W, int[] weights, int[] values) {
        int n = weights.length;
        int[][] dp = new int[n+1][W+1];
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                dp[i][w] = dp[i-1][w];
                if (weights[i-1] <= w) dp[i][w] = Math.max(dp[i][w], dp[i-1][w-weights[i-1]] + values[i-1]);
            }
        }
        return dp[n][W];
    }
}
