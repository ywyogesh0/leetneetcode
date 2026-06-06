package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class PermutationsTest {
    @Test
    public void exampleTest() {
        int[] nums = {1,2,3};
        List<List<Integer>> res = Permutations.permute(nums);
        assertEquals(6, res.size());
    }
}
