package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class TopKFrequentTest {
    @Test
    public void exampleTest() {
        int[] nums = {1,1,1,2,2,3};
        int[] res = TopKFrequent.topKFrequent(nums, 2);
        assertArrayEquals(new int[]{1,2}, res);
    }
}
