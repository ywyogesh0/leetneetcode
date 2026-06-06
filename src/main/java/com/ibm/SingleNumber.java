package com.ibm;

/**
 * Problem 40: Single Number (XOR)
 *
 * Input: integer array `nums` where every element appears twice except for one.
 * Output: the single (non-duplicated) integer.
 * Example: [4,1,2,1,2] -> 4
 *
 * Approach: XOR all numbers to cancel pairs, leaving the single number (O(n), O(1) space).
 *
 * Visual Illustration (nums=[4,1,2,1,2]):
 * 1) xor=0
 * 2) xor^=4 -> 4; xor^=1 -> 5; xor^=2 -> 7; xor^=1 -> 6; xor^=2 -> 4 -> result 4
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) res ^= n;
        return res;
    }
}
