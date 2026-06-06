package com.ibm;

/**
 * Problem 2: Maximum Subarray (Kadane's Algorithm)
 *
 * Input: integer array `nums`.
 * Output: the largest sum of a contiguous subarray.
 * Example: [-2,1,-3,4,-1,2,1,-5,4] -> 6 (subarray [4,-1,2,1])
 *
 * Approach: Kadane's algorithm tracking current max ending here and global max (O(n)).
 *
 * Visual Illustration (nums=[-2,1,-3,4,-1,2,1,-5,4]):
 * 1) curr=-2,max=-2
 * 2) i=1 num=1 -> curr=max(1,-2+1)=1, max=1
 * 3) i=3 num=4 -> curr=4, max=4; continue updating to final max=6 for subarray [4,-1,2,1]
 */
public class MaxSubarray {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
