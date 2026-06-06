package com.ibm;

import java.util.*;

/**
 * Problem 26: Permutations (backtracking)
 *
 * Input: integer array `nums`.
 * Output: list of all permutations of `nums` as lists.
 * Example: [1,2,3] -> [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *
 * Approach: backtracking building permutations by choosing unused elements.
 *
 * Visual Illustration (nums=[1,2,3]):
 * 1) choose 1 -> current=[1]; recurse
 * 2) choose 2 -> current=[1,2]; recurse
 * 3) choose 3 -> current=[1,2,3] -> emit permutation
 * 4) backtrack and explore other orders (1,3,2), (2,1,3), etc.
 */
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], res);
        return res;
    }
    private static void backtrack(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> res) {
        if (current.size() == nums.length) { res.add(new ArrayList<>(current)); return; }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true; current.add(nums[i]);
            backtrack(nums, current, used, res);
            current.remove(current.size()-1); used[i] = false;
        }
    }
}
