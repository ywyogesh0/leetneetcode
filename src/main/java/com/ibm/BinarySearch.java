package com.ibm;

/**
 * Problem 18: Binary Search
 *
 * Input: sorted integer array `nums` and integer `target`.
 * Output: index of `target` in `nums` or -1 if not found.
 * Example: nums = [-1,0,3,5,9,12], target = 9 -> 4
 *
 * Approach: classic binary search dividing the search interval in half each step (O(log n)).
 *
 * Visual Illustration (nums=[-1,0,3,5,9,12], target=9):
 * 1) left=0,right=5,mid=2 -> nums[2]=3 < 9 -> move left=3
 * 2) left=3,right=5,mid=4 -> nums[4]=9 == target -> return 4
 */
public class BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
