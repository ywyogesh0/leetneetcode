package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrappingRainWaterTest {
    @Test
    public void exampleTest() {
        int[] h = {0,1,0,2,1,0,1,3,1,0,1,2};
        assertEquals(9, TrappingRainWater.trap(h));
    }
}
