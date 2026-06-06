package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {
    @Test
    public void exampleTest() {
        int[] h = {1,8,6,2,5,4,8,3,7};
        assertEquals(49, ContainerWithMostWater.maxArea(h));
    }
}
