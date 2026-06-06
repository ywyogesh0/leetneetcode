package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class SubsetsTest {
    @Test
    public void exampleTest() {
        int[] nums = {1,2,3};
        List<List<Integer>> res = Subsets.subsets(nums);
        assertEquals(8, res.size());
    }
}
