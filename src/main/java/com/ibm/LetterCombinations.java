package com.ibm;

import java.util.*;

/**
 * Problem 47: Letter Combinations of Phone Number
 *
 * Input: string `digits` containing digits 2-9.
 * Output: list of all possible letter combinations the number could represent.
 * Example: "23" -> ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 *
 * Approach: backtracking / DFS generating combinations using digit->letters mapping.
 *
 * Visual Illustration (digits="23"):
 * 1) idx=0 digit '2' -> letters 'a','b','c'
 * 2) pick 'a', recurse idx=1 digit '3' -> pick 'd','e','f' -> produce "ad","ae","af"
 * 3) backtrack and pick 'b' -> produce "bd","be","bf", then 'c' -> "cd","ce","cf"
 */
public class LetterCombinations {
    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return new ArrayList<>();
        Map<Character, String> map = Map.of(
            '2',"abc",'3',"def",'4',"ghi",'5',"jkl",
            '6',"mno",'7',"pqrs",'8',"tuv",'9',"wxyz");
        List<String> res = new ArrayList<>();
        backtrack(digits, map, 0, new StringBuilder(), res);
        return res;
    }
    private static void backtrack(String digits, Map<Character,String> map, int idx, StringBuilder cur, List<String> res) {
        if (idx == digits.length()) { res.add(cur.toString()); return; }
        for (char c : map.get(digits.charAt(idx)).toCharArray()) {
            cur.append(c); backtrack(digits, map, idx+1, cur, res); cur.deleteCharAt(cur.length()-1);
        }
    }
}
