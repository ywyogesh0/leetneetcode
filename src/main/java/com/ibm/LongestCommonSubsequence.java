package com.ibm;

/**
 * Problem 10: Longest Common Subsequence (LCS)
 *
 * Input: two strings `s1` and `s2`.
 * Output: length of their longest common subsequence.
 * Example: "abcde", "ace" -> 3 ("ace")
 *
 * Approach: dynamic programming over prefixes (2D DP table) with O(n*m) time and O(n*m) space.
 *
 * Visual Illustration (s1="abcde", s2="ace"):
 * 1) build DP table rows for s1 prefixes and columns for s2 prefixes
 * 2) when chars match (a vs a) increment diagonal value; else take max of top/left
 * 3) final cell dp[m][n]=3 indicates LCS length 3 ("ace")
 */
public class LongestCommonSubsequence {
    public static int lcs(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
}
