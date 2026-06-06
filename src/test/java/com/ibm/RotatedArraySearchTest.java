package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class RotatedArraySearchTest {
    @Test
    public void exampleTest() {
        int[] nums = {4,5,6,7,0,1,2};
        assertEquals(4, RotatedArraySearch.search(nums, 0));
    }
}
