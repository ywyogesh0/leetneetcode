package com.ibm;

import java.util.*;

/**
 * Problem 20: Find Duplicates in Array
 *
 * Input: integer array `nums`.
 * Output: list of integers that appear more than once.
 * Example: [4,3,2,7,8,2,3,1] -> [2,3]
 *
 * Approach: use a HashSet to detect repeats; alternative in-place marking approaches exist.
 *
 * Visual Illustration (nums=[4,3,2,7,8,2,3,1]):
 * 1) iterate and add to set: seen={4,3,2,7,8}
 * 2) when encountering 2 again -> add to result [2]; encountering 3 again -> result [2,3]
 */
public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) res.add(num);
        }
        return res;
    }
}
