package com.leetneetcode.datastructures.topinterview150.heap;

/**
 * Insert into Max & Min Heap
 *
 * Problem: Given a binary heap represented as an array and a value to insert,
 * return the heap array after inserting the value while preserving the heap
 * property. Two variants are supported: max-heap (parent >= children) and
 * min-heap (parent <= children).
 *
 * Visual Illustration (Max heap insert, heap=[10,5,3], insert=12):
 * 1) Append 12 -> [10,5,3,12]
 * 2) Bubble up 12 vs parent 5 -> [10,12,3,5]
 * 3) Bubble up 12 vs parent 10 -> [12,10,3,5]
 *
 * Visual Illustration (Min heap insert, heap=[2,6,9], insert=1):
 * 1) Append 1 -> [2,6,9,1]
 * 2) Bubble up 1 vs parent 6 -> [2,1,9,6]
 * 3) Bubble up 1 vs parent 2 -> [1,2,9,6]
 */
public class HeapInsert {

    /**
     * Insert a value into a max-heap represented by an int array.
     *
     * @param heap  input heap as an array (array-backed binary heap, root at index
     *              0)
     * @param value the value to insert into the max-heap
     * @return a new int[] representing the heap after insertion
     */
    public static int[] insertIntoMaxHeap(int[] heap, int value) {
        int heapSize = heap.length;
        int newHeap[] = new int[heapSize + 1];

        for (int i = 0; i < heapSize; i++) {
            newHeap[i] = heap[i];
        }

        int valueIndex = newHeap.length - 1;

        while (valueIndex > 0 && value > newHeap[parentIndex(valueIndex)]) {
            int parentIndex = parentIndex(valueIndex);

            newHeap[valueIndex] = newHeap[parentIndex];
            valueIndex = parentIndex;
        }

        newHeap[valueIndex] = value;

        return newHeap;

    }

    /**
     * Insert a value into a min-heap represented by an int array.
     *
     * @param heap  input heap as an array (array-backed binary heap, root at index
     *              0)
     * @param value the value to insert into the min-heap
     * @return a new int[] representing the heap after insertion
     */
    public static int[] insertIntoMinHeap(int[] heap, int value) {
        int heapSize = heap.length;
        int newHeap[] = new int[heapSize + 1];

        for (int i = 0; i < heapSize; i++) {
            newHeap[i] = heap[i];
        }

        int valueIndex = newHeap.length - 1;

        while (valueIndex > 0 && value < newHeap[parentIndex(valueIndex)]) {
            int parentIndex = parentIndex(valueIndex);

            newHeap[valueIndex] = newHeap[parentIndex];
            valueIndex = parentIndex;
        }

        newHeap[valueIndex] = value;

        return newHeap;
    }

    // Helper method to compute the parent index of a given value index in a binary
    // heap.
    private static int parentIndex(int valueIndex) {
        return valueIndex % 2 == 0 ? (valueIndex / 2) - 1 : valueIndex / 2;
    }
}
