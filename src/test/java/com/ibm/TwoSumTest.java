package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class TwoSumTest {
    @Test
    public void exampleTest() {
        int[] nums = {2,7,11,15};
        int[] res = TwoSum.twoSum(nums, 9);
        assertTrue(Arrays.equals(new int[]{0,1}, res));
    }
}
