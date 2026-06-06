package com.ibm;

/**
 * Problem 27: Product of Array Except Self
 *
 * Input: integer array `nums`.
 * Output: array `answer` where answer[i] is product of all elements except nums[i], without using division.
 * Example: [1,2,3,4] -> [24,12,8,6]
 *
 * Approach: compute prefix and suffix products (O(n) time, O(1) extra space excluding output).
 *
 * Visual Illustration (nums=[1,2,3,4]):
 * 1) prefix products: [1,1,2,6] (product of elements to left)
 * 2) suffix products: [24,12,4,1] (product of elements to right)
 * 3) answer[i] = prefix[i-1] * suffix[i+1] -> [24,12,8,6]
 */
public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) result[i] = result[i-1] * nums[i-1];
        int right = 1;
        for (int i = n-1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }
}
