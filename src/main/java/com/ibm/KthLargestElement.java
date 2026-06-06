package com.ibm;

import java.util.PriorityQueue;

    /**
     * Problem 43: Kth Largest Element in an Array
     *
     * Input: integer array `nums` and integer `k`.
     * Output: the k-th largest element in the array.
     * Example: [3,2,1,5,6,4], k=2 -> 5
     *
     * Approach: use quickselect partition or a min-heap of size k.
     *
     * Visual Illustration (nums=[3,2,1,5,6,4], k=2):
     * 1) using min-heap size 2: push 3,2 -> heap=[2,3]
     * 2) push 1 -> heap stays [2,3] (1 discarded)
     * 3) push 5 -> pop smallest -> heap=[3,5]
     * 4) push 6 -> pop smallest -> heap=[5,6] -> top=5 is 2nd largest
     */
/**
 * Problem 30: Kth Largest Element
 */
public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) minHeap.poll();
        }
        return minHeap.peek();
    }
}
