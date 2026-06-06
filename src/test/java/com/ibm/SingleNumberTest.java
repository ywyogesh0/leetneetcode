package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class SingleNumberTest {
    @Test
    public void exampleTest() {
        int[] nums = {4,1,2,1,2};
        assertEquals(4, SingleNumber.singleNumber(nums));
    }
}
