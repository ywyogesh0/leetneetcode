package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class TopologicalSortTest {
    @Test
    public void exampleTest() {
        int n = 4;
        int[][] pre = {{1,0},{2,0},{3,1},{3,2}};
        int[] order = TopologicalSort.findOrder(n, pre);
        assertEquals(4, order.length);
    }
}
