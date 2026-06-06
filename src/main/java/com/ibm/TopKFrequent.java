package com.ibm;

import java.util.*;

/**
 * Problem 48: Top K Frequent Elements
 *
 * Input: integer array `nums` and integer `k`.
 * Output: list of the k most frequent elements.
 * Example: nums = [1,1,1,2,2,3], k = 2 -> [1,2]
 *
 * Approach: use frequency map and either bucket sort or a min-heap (priority queue).
 *
 * Visual Illustration (nums=[1,1,1,2,2,3], k=2):
 * 1) frequency map {1:3,2:2,3:1}
 * 2) bucket by frequency -> buckets[3]=[1], buckets[2]=[2], buckets[1]=[3]
 * 3) collect from high freq: result [1,2]
 */
public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        for (int n : nums) count.merge(n, 1, Integer::sum);
        List<Integer>[] buckets = new List[nums.length + 1];
        for (Map.Entry<Integer,Integer> e : count.entrySet()) {
            int freq = e.getValue();
            if (buckets[freq] == null) buckets[freq] = new ArrayList<>();
            buckets[freq].add(e.getKey());
        }
        int[] res = new int[k]; int idx = 0;
        for (int i = buckets.length - 1; i >= 0 && idx < k; i--) {
            if (buckets[i] != null) for (int num : buckets[i]) if (idx < k) res[idx++] = num;
        }
        return res;
    }
}
