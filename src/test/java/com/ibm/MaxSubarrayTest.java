package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxSubarrayTest {
    @Test
    public void exampleTest() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, MaxSubarray.maxSubArray(nums));
    }
}
