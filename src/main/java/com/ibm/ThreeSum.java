package com.ibm;

import java.util.*;

/**
 * Problem 36: 3Sum
 *
 * Input: integer array `nums`.
 * Output: list of unique triplets [a,b,c] where a+b+c==0.
 * Example: [-1,0,1,2,-1,-4] -> [[-1,-1,2],[-1,0,1]]
 *
 * Approach: sort and use two-pointer scan with deduplication.
 *
 * Visual Illustration (nums=[-1,0,1,2,-1,-4]):
 * 1) sort -> [-4,-1,-1,0,1,2]
 * 2) fix first element -1 (i=1) and two-pointer find pairs that sum to 1 -> [-1,0,1]
 * 3) fix first element -1 (i=2 duplicate skipped), continue to find [-1,-1,2]
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left]==nums[left+1]) left++;
                    while (left < right && nums[right]==nums[right-1]) right--;
                    left++; right--;
                } else if (sum < 0) left++; else right--;
            }
        }
        return res;
    }
}
