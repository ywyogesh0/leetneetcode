package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class FindDuplicatesTest {
    @Test
    public void exampleTest() {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> dups = FindDuplicates.findDuplicates(nums);
        assertTrue(dups.contains(2));
        assertTrue(dups.contains(3));
    }
}
