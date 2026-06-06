package com.ibm;

import java.util.*;

/**
 * Problem 22: Minimum Window Substring
 *
 * Input: strings `s` and `t`.
 * Output: the minimum window substring of `s` that contains all characters of `t` (or empty string if none).
 * Example: s = "ADOBECODEBANC", t = "ABC" -> "BANC"
 *
 * Approach: sliding window with character counts, expand and contract to maintain coverage.
 *
 * Visual Illustration (s="ADOBECODEBANC", t="ABC"):
 * 1) expand right pointer until window contains A,B,C at indices covering "ADOBEC"
 * 2) contract left to shorten window to "BEC" then expand/contract while scanning to find minimal "BANC"
 */
public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        if (t.isEmpty()) return "";
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) need.merge(c, 1, Integer::sum);
        Map<Character, Integer> window = new HashMap<>();
        int have = 0, required = need.size();
        int[] ans = {-1, 0, 0};
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.merge(c, 1, Integer::sum);
            if (need.containsKey(c) && window.get(c).intValue() == need.get(c).intValue()) have++;
            while (have == required) {
                if (ans[0] == -1 || right - left + 1 < ans[0]) ans = new int[]{right-left+1, left, right};
                char lc = s.charAt(left++);
                window.merge(lc, -1, Integer::sum);
                if (need.containsKey(lc) && window.get(lc) < need.get(lc)) have--;
            }
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2]+1);
    }
}
