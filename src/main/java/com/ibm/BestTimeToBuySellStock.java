package com.ibm;

/**
 * Problem 32: Best Time to Buy & Sell Stock (one transaction)
 *
 * Input: an integer array `prices` where prices[i] is the price of a given stock on day i.
 * Output: the maximum profit achievable with one buy and one sell.
 * Example: prices = [7,1,5,3,6,4] -> returns 5 (buy at 1, sell at 6)
 *
 * Approach: track the minimum price seen so far and compute max difference (O(n) time, O(1) space).
 *
 * Visual Illustration (prices=[7,1,5,3,6,4]):
 * 1) minPrice=7, maxProfit=0
 * 2) price=1 -> minPrice=1, maxProfit=0
 * 3) price=5 -> profit=4 -> maxProfit=4
 * 4) price=3 -> profit=2 -> maxProfit=4
 * 5) price=6 -> profit=5 -> maxProfit=5
 * 6) price=4 -> profit=3 -> maxProfit=5 (result)
 */
public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) minPrice = price;
            else maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
