package com.ibm;

import java.util.Stack;

/**
 * Problem 17: Largest Rectangle in Histogram
 *
 * Input: integer array `heights` representing bar heights.
 * Output: maximum area of rectangle in histogram.
 * Example: [2,1,5,6,2,3] -> 10
 *
 * Approach: use a monotonic stack to maintain increasing heights and compute areas when popping.
 *
 * Visual Illustration (heights=[2,1,5,6,2,3]):
 * 1) push indices while heights increase: push 0(height2)
 * 2) i=1 height1 < height2 -> pop index0 compute area 2*1 = 2, push 1
 * 3) proceed pushing/popping and compute max area 10 from heights 5 and 6
 */
public class LargestRectangleHistogram {
    public static int largestRectangle(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= heights.length; i++) {
            int h = (i == heights.length) ? 0 : heights[i];
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
