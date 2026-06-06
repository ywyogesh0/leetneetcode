package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class ThreeSumTest {
    @Test
    public void exampleTest() {
        int[] nums = {-4,-1,-1,0,1,2};
        List<List<Integer>> res = ThreeSum.threeSum(nums);
        assertTrue(res.contains(Arrays.asList(-1,-1,2)));
        assertTrue(res.contains(Arrays.asList(-1,0,1)));
    }
}
