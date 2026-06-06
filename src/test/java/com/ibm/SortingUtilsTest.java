package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class SortingUtilsTest {
    @Test
    public void mergeSortTest() {
        int[] arr = {38,27,43,3,9,82};
        SortingUtils.mergeSort(arr);
        assertArrayEquals(new int[]{3,9,27,38,43,82}, arr);
    }
    @Test
    public void quickSortTest() {
        int[] arr = {3,6,8,10,1,2,1};
        SortingUtils.quickSort(arr);
        assertArrayEquals(new int[]{1,1,2,3,6,8,10}, arr);
    }
}
