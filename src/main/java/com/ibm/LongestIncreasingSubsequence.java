package com.ibm;

import java.util.Arrays;

/**
 * Problem 24: Longest Increasing Subsequence (O(n^2) DP)
 *
 * Input: integer array `nums`.
 * Output: length of the longest strictly increasing subsequence.
 * Example: [10,9,2,5,3,7,101,18] -> 4 (2,3,7,101)
 *
 * Approach: DP with O(n^2) recurrence dp[i] = 1 + max(dp[j]) for j<i and nums[j]<nums[i].
 *
 * Visual Illustration (nums=[10,9,2,5,3,7,101,18]):
 * 1) dp initialized to [1,1,1,1,1,1,1,1]
 * 2) process nums[3]=5: compare with earlier values and update dp[3]=2 (sequence [2,5])
 * 3) final dp yields max 4 corresponding to [2,3,7,101]
 */
public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int maxLen = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            maxLen = Math.max(maxLen, dp[i]);
        }
        return maxLen;
    }
}
