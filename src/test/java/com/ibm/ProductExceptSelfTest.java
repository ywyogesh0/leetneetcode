package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductExceptSelfTest {
    @Test
    public void exampleTest() {
        int[] nums = {1,2,3,4};
        assertArrayEquals(new int[]{24,12,8,6}, ProductExceptSelf.productExceptSelf(nums));
    }
}
