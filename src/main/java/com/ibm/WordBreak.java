package com.ibm;

import java.util.*;

/**
 * Problem 43: Word Break
 *
 * Input: string `s` and a list of words `wordDict`.
 * Output: boolean indicating whether `s` can be segmented into a sequence of dictionary words.
 * Example: s = "leetcode", wordDict = ["leet","code"] -> true
 *
 * Approach: DP where dp[i] is true if s[0:i) can be segmented; check substrings against the dictionary.
 *
 * Visual Illustration (s="leetcode", wordDict=["leet","code"]):
 * 1) dp[0]=true
 * 2) i=4 -> substring s[0:4]="leet" in dict and dp[0]=true -> dp[4]=true
 * 3) i=8 -> substring s[4:8]="code" in dict and dp[4]=true -> dp[8]=true -> return true
 */
public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) { dp[i] = true; break; }
            }
        }
        return dp[s.length()];
    }
}
