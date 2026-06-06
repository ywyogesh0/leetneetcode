package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class LargestRectangleHistogramTest {
    @Test
    public void exampleTest() {
        int[] h = {2,1,5,6,2,3};
        assertEquals(10, LargestRectangleHistogram.largestRectangle(h));
    }
}
