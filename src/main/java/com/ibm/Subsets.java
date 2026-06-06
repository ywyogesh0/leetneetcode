package com.ibm;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem 25: Subsets / Power Set
 *
 * Input: integer array `nums`.
 * Output: list of all subsets (the power set) of `nums`.
 * Example: [1,2] -> [[],[1],[2],[1,2]]
 *
 * Approach: iterative expansion or backtracking to generate subsets.
 *
 * Visual Illustration (nums=[1,2]):
 * 1) start with [[]]
 * 2) add 1: [[],[1]]
 * 3) add 2 to each existing subset: [[],[1],[2],[1,2]]
 */
public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(num);
                result.add(subset);
            }
        }
        return result;
    }
}
