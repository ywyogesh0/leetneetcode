package com.ibm;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem 21: Longest Substring Without Repeating Characters
 */
/**
 * Problem 21: Longest Substring Without Repeating Characters
 *
 * Input: string `s`.
 * Output: length of the longest substring without repeating characters.
 * Example: "abcabcbb" -> 3 ("abc")
 *
 * Approach: sliding window with last-seen index map to maintain window without duplicates.
 *
 * Visual Illustration (s="abcabcbb"):
 * 1) expand to "abc" -> maxLen=3
 * 2) next char 'a' seen -> move left to index after previous 'a' to maintain unique window
 * 3) continue sliding to compute final maxLen=3
 */
public class LongestSubstringNoRepeat {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c) && map.get(c) >= left) left = map.get(c) + 1;
            map.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
