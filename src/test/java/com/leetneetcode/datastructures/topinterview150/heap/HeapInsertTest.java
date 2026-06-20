package com.leetneetcode.datastructures.topinterview150.heap;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

/**
 * JUnit tests for heap insertions (max & min). Each test includes a visual
 * illustration of the expected heap transformation.
 */
public class HeapInsertTest {

    @Test
    public void insertIntoEmptyMaxHeap() {
        // Visual: [] + 5 -> [5]
        int[] heap = {};
        int[] expected = {5};
        int[] res = HeapInsert.insertIntoMaxHeap(heap, 5);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void insertLargerIntoMaxHeap() {
        // Visual: [10,5,3] + 12 -> append -> [10,5,3,12] -> bubble -> [12,10,3,5]
        int[] heap = {10,5,3};
        int[] expected = {12,10,3,5};
        int[] res = HeapInsert.insertIntoMaxHeap(heap, 12);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void insertDuplicateIntoMaxHeap() {
        // Visual: [8,6,6] + 6 -> [8,6,6,6] -> bubble as needed (stable heap)
        int[] heap = {8,6,6};
        int[] expected = {8,6,6,6};
        int[] res = HeapInsert.insertIntoMaxHeap(heap, 6);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void insertIntoEmptyMinHeap() {
        // Visual: [] + 4 -> [4]
        int[] heap = {};
        int[] expected = {4};
        int[] res = HeapInsert.insertIntoMinHeap(heap, 4);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void insertSmallerIntoMinHeap() {
        // Visual: [2,6,9] + 1 -> append -> [2,6,9,1] -> bubble -> [1,2,9,6]
        int[] heap = {2,6,9};
        int[] expected = {1,2,9,6};
        int[] res = HeapInsert.insertIntoMinHeap(heap, 1);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void insertDuplicateIntoMinHeap() {
        // Visual: [3,4,5] + 4 -> [3,4,5,4] -> bubble as needed
        int[] heap = {3,4,5};
        int[] expected = {3,4,5,4};
        int[] res = HeapInsert.insertIntoMinHeap(heap, 4);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void insertMaxHeap_size10() {
        int[] heap = {100,90,80,70,60,50,40,30,20,10};
        int[] expected = {105,100,80,70,90,50,40,30,20,10,60};
        int[] res = HeapInsert.insertIntoMaxHeap(heap, 105);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void insertMaxHeap_size11() {
        int[] heap = {50,45,40,35,30,25,20,15,10,5,1};
        int[] expected = {60,45,50,35,30,40,20,15,10,5,1,25};
        int[] res = HeapInsert.insertIntoMaxHeap(heap, 60);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void insertMaxHeap_size12() {
        int[] heap = {2,1,0, -1, -2, -3, -4, -5, -6, -7, -8, -9};
        int[] expected = {3,1,2,-1,-2,0,-4,-5,-6,-7,-8,-9,-3};
        int[] res = HeapInsert.insertIntoMaxHeap(heap, 3);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void insertMaxHeap_size13() {
        int[] heap = {200,190,180,170,160,150,140,130,120,110,100,90,80};
        int[] expected = {200,190,195,170,160,150,180,130,120,110,100,90,80,140};
        int[] res = HeapInsert.insertIntoMaxHeap(heap, 195);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void insertMaxHeap_size14() {
        int[] heap = {14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        int[] expected = {15,13,14,11,10,9,12,7,6,5,4,3,2,1,8};
        int[] res = HeapInsert.insertIntoMaxHeap(heap, 15);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void insertMaxHeap_size15() {
        int[] heap = {30,29,28,27,26,25,24,23,22,21,20,19,18,17,16};
        int[] expected = {31,30,28,29,26,25,24,27,22,21,20,19,18,17,16,23};
        int[] res = HeapInsert.insertIntoMaxHeap(heap, 31);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void insertMinHeap_size10() {
        int[] heap = {1,2,3,4,5,6,7,8,9,10};
        int[] expected = {0,1,3,4,2,6,7,8,9,10,5};
        int[] res = HeapInsert.insertIntoMinHeap(heap, 0);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void insertMinHeap_size11() {
        int[] heap = {5,6,7,8,9,10,11,12,13,14,15};
        int[] expected = {1,6,5,8,9,7,11,12,13,14,15,10};
        int[] res = HeapInsert.insertIntoMinHeap(heap, 1);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void insertMinHeap_size12() {
        int[] heap = {2,3,4,5,6,7,8,9,10,11,12,13};
        int[] expected = {1,3,2,5,6,4,8,9,10,11,12,13,7};
        int[] res = HeapInsert.insertIntoMinHeap(heap, 1);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void insertMinHeap_size13() {
        int[] heap = {10,11,12,13,14,15,16,17,18,19,20,21,22};
        int[] expected = {9,11,10,13,14,15,12,17,18,19,20,21,22,16};
        int[] res = HeapInsert.insertIntoMinHeap(heap, 9);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void insertMinHeap_size14() {
        int[] heap = {4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int[] expected = {3,5,4,7,8,9,6,11,12,13,14,15,16,17,10};
        int[] res = HeapInsert.insertIntoMinHeap(heap, 3);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void insertMinHeap_size15() {
        int[] heap = {20,21,22,23,24,25,26,27,28,29,30,31,32,33,34};
        int[] expected = {19,20,22,21,24,25,26,23,28,29,30,31,32,33,34,27};
        int[] res = HeapInsert.insertIntoMinHeap(heap, 19);
        assertTrue(Arrays.equals(expected, res));
    }
}
