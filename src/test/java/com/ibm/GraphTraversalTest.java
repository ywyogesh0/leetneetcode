package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class GraphTraversalTest {
    @Test
    public void bfsTest() {
        Map<Integer, List<Integer>> g = new HashMap<>();
        g.put(0, Arrays.asList(1,2)); g.put(1, Arrays.asList(3)); g.put(2, Arrays.asList(4));
        List<Integer> order = GraphTraversal.bfs(g, 0);
        assertEquals(Arrays.asList(0,1,2,3,4), order);
    }
}
