package com.ibm;

/**
 * Problem 31: Jump Game (greedy)
 *
 * Input: non-negative integer array `nums` where each element represents max jump length from that position.
 * Output: boolean whether you can reach the last index.
 * Example: [2,3,1,1,4] -> true
 *
 * Approach: greedy farthest-reachable tracking; iterate and update max reach, fail if index exceeds reach.
 *
 * Visual Illustration (nums=[2,3,1,1,4]):
 * 1) reachable=0; i=0 -> reachable=max(0,0+2)=2
 * 2) i=1 -> reachable=max(2,1+3)=4 -> since reachable >= last index, return true
 */
public class JumpGame {
    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false;
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) return true;
        }
        return true;
    }
}
