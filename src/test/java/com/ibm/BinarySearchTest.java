package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void exampleTest() {
        int[] arr = {1,3,5,7,9,11,13};
        assertEquals(3, BinarySearch.binarySearch(arr, 7));
        assertEquals(-1, BinarySearch.binarySearch(arr, 8));
    }
}
