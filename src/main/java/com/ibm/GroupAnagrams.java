package com.ibm;

import java.util.*;

/**
 * Problem 28: Group Anagrams
 *
 * Input: array of strings `strs`.
 * Output: list of lists grouping anagrams together.
 * Example: ["eat","tea","tan","ate","nat","bat"] -> [["eat","tea","ate"],["tan","nat"],["bat"]]
 *
 * Approach: sort characters of each string to form a key or use character count as key; group using a hashmap.
 *
 * Visual Illustration (strs=["eat","tea","tan","ate","nat","bat"]):
 * 1) "eat" -> key="aet" -> map{"aet":["eat"]}
 * 2) "tea" -> key="aet" -> map{"aet":["eat","tea"]}
 * 3) "tan" -> key="ant" -> map{"aet":[...],"ant":["tan"]}
 * 4) continue -> final groups extracted from map values.
 */
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] a = s.toCharArray();
            Arrays.sort(a);
            String key = new String(a);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
