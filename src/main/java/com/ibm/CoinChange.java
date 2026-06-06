package com.ibm;

import java.util.Arrays;

/**
 * Problem 38: Coin Change (min coins)
 *
 * Input: coin denominations `coins` and integer `amount`.
 * Output: minimum number of coins to make up `amount`, or -1 if impossible.
 * Example: coins=[1,2,5], amount=11 -> 3 (5+5+1)
 *
 * Approach: dynamic programming computing min coins for each sub-amount.
 *
 * Visual Illustration (coins=[1,2,5], amount=11):
 * 1) dp[0]=0
 * 2) for i=1..11 update dp[i] by checking each coin
 * 3) dp[11] becomes 3 using coins [5,5,1]
 */
public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
