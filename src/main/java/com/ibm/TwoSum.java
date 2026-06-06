package com.ibm;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem 1: Two Sum
 *
 * Input: an integer array `nums` and an integer `target`.
 * Output: an int[] with two indices i and j such that nums[i] + nums[j] == target.
 * Example: nums = [2,7,11,15], target = 9 -> returns [0,1]
 *
 * Approach: single-pass HashMap storing value -> index, check complement for O(n) time.
 *
 * Visual Illustration (example nums=[2,7,11,15], target=9):
 * 1) i=0, num=2, map={}, complement=7 not found -> map={2:0}
 * 2) i=1, num=7, complement=2 found in map -> return [0,1]
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
