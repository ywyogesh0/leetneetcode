package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class KthLargestElementTest {
    @Test
    public void exampleTest() {
        int[] nums = {3,2,1,5,6,4};
        assertEquals(5, KthLargestElement.findKthLargest(nums, 2));
    }
}
