package com.ibm;

/**
 * Problem 19: Search in Rotated Sorted Array
 *
 * Input: rotated sorted integer array `nums` and integer `target`.
 * Output: index of `target` or -1 if not found.
 * Example: nums=[4,5,6,7,0,1,2], target=0 -> 4
 *
 * Approach: modified binary search by identifying sorted half each step.
 *
 * Visual Illustration (nums=[4,5,6,7,0,1,2], target=0):
 * 1) left=0,right=6,mid=3 -> nums[3]=7 not target; left half [4,5,6,7] is sorted
 * 2) target not in left half -> move left=4
 * 3) left=4,right=6,mid=5 -> nums[5]=1; check and find target at index 4
 */
public class RotatedArraySearch {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (target > nums[mid] && target <= nums[right]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
}
