package com.ibm;

/**
 * Problem 9: Climbing Stairs (Fibonacci)
 *
 * Input: integer `n` number of steps.
 * Output: number of distinct ways to climb to the top (1 or 2 steps each move).
 * Example: n=3 -> 3
 *
 * Approach: dynamic programming / Fibonacci iteration with O(1) space.
 *
 * Visual Illustration (n=4):
 * 1) ways[1]=1, ways[2]=2
 * 2) i=3 -> ways=ways[2]+ways[1]=3
 * 3) i=4 -> ways=ways[3]+ways[2]=5 -> return 5
 */
public class ClimbStairs {
    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int prev2 = 1, prev1 = 2;
        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1; prev1 = curr;
        }
        return prev1;
    }
}
