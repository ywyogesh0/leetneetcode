package com.ibm;

/**
 * Problem 3: Valid Palindrome
 *
 * Input: a string `s` which may contain non-alphanumeric characters.
 * Output: boolean indicating whether `s` is a palindrome considering only alphanumeric characters, case-insensitive.
 * Example: "A man, a plan, a canal: Panama" -> true
 *
 * Approach: two-pointer scan from both ends, skipping non-alphanumeric chars.
 *
 * Visual Illustration ("A man, a plan, a canal: Panama"):
 * 1) sanitize by skipping spaces/punctuation and compare letters case-insensitively
 * 2) comparisons: A==A, m==m, a==a, ... until pointers cross -> true
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++; right--;
        }
        return true;
    }
}
