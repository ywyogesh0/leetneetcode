package com.ibm;

/**
 * Problem 42: Longest Palindromic Substring
 *
 * Input: string `s`.
 * Output: the longest palindromic substring within `s`.
 * Example: "babad" -> "bab" or "aba"
 *
 * Approach: expand around centers for odd/even length palindromes, O(n^2) worst-case.
 *
 * Visual Illustration (s="babad"):
 * 1) center i=0 -> expand "b" -> palindrome "b"
 * 2) center i=1 -> expand around "a" and between "b" and "a" to find "bab"
 * 3) continue scanning, another palindrome "aba" found; return one with max length
 */
public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, maxLen = 1;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i+1);
            int len = Math.max(len1, len2);
            if (len > maxLen) { start = i - (len-1)/2; maxLen = len; }
        }
        return s.substring(start, start + maxLen);
    }
    private static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) { left--; right++; }
        return right - left - 1;
    }
}
