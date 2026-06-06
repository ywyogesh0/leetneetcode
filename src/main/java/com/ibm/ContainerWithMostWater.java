package com.ibm;

/**
 * Problem 41: Container With Most Water
 *
 * Input: array `height` of non-negative integers representing vertical lines.
 * Output: maximum area of water container formed by two lines and the x-axis.
 * Example: [1,8,6,2,5,4,8,3,7] -> 49
 *
 * Approach: two-pointer shrink towards center keeping track of max area.
 *
 * Visual Illustration (height=[1,8,6,2,5,4,8,3,7]):
 * 1) left=0,right=8 -> area=min(1,7)*8=8
 * 2) move left (1<7) -> left=1,right=8 -> area=min(8,7)*7=49 (max)
 * 3) continue moving pointers while updating max -> result 49
 */
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            int water = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, water);
            if (height[left] < height[right]) left++; else right--;
        }
        return max;
    }
}
