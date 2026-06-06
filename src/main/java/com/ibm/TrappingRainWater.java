package com.ibm;

/**
 * Problem 45: Trapping Rain Water
 */
/**
 * Problem 12: Trapping Rain Water
 *
 * Input: integer array `height` representing elevation map.
 * Output: total units of water that can be trapped.
 * Example: [0,1,0,2,1,0,1,3,2,1,2,1] -> 6
 *
 * Approach: use two-pointer scan or precompute leftMax/rightMax arrays to accumulate trapped water.
 *
 * Visual Illustration (height=[0,1,0,2,1,0,1,3,2,1,2,1]):
 * 1) leftMax per index and rightMax per index computed
 * 2) at each i water += max(0, min(leftMax[i],rightMax[i]) - height[i])
 * 3) summing yields 6 units trapped (detailed per-index step-by-step in code comments)
 */
public class TrappingRainWater {
    public static int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) leftMax[i] = Math.max(leftMax[i-1], height[i]);
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) rightMax[i] = Math.max(rightMax[i+1], height[i]);
        int water = 0;
        for (int i = 0; i < n; i++) water += Math.max(0, Math.min(leftMax[i], rightMax[i]) - height[i]);
        return water;
    }
}
