package com.ibm;

import java.util.*;

/**
 * Problem 35: KMP pattern matching
 *
 * Input: `text` and `pattern` strings.
 * Output: start indices where `pattern` occurs in `text` (as int[]).
 * Example: text="ababcab", pattern="ab" -> [0,2,5]
 *
 * Approach: build LPS (longest prefix suffix) array and run linear-time KMP matcher.
 *
 * Visual Illustration (text="ababcab", pattern="ab"):
 * 1) compute LPS for pattern "ab" -> [0,0]
 * 2) scan text: match at indices 0,2,5 -> return [0,2,5]
 */
public class KMP {
    public static int[] kmpSearch(String text, String pattern) {
        if (pattern.isEmpty()) return new int[0];
        int n = text.length(), m = pattern.length();
        int[] lps = computeLPS(pattern);
        List<Integer> matches = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) { i++; j++; }
            if (j == m) { matches.add(i-j); j = lps[j-1]; }
            else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) j = lps[j-1]; else i++;
            }
        }
        return matches.stream().mapToInt(x->x).toArray();
    }
    private static int[] computeLPS(String p) {
        int[] lps = new int[p.length()];
        int len = 0, i = 1;
        while (i < p.length()) {
            if (p.charAt(i) == p.charAt(len)) lps[i++] = ++len;
            else if (len != 0) len = lps[len-1];
            else lps[i++] = 0;
        }
        return lps;
    }
}
