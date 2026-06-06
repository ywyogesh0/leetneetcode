package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class LongestIncreasingSubsequenceTest {
    @Test
    public void exampleTest() {
        int[] nums = {10,9,2,5,3,7,101,18};
        assertEquals(4, LongestIncreasingSubsequence.lengthOfLIS(nums));
    }
}
