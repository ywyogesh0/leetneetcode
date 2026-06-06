package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class CloneGraphTest {
    @Test
    public void exampleTest() {
        GraphNode n1 = new GraphNode(1);
        GraphNode n2 = new GraphNode(2);
        GraphNode n3 = new GraphNode(3);
        n1.neighbors.add(n2); n1.neighbors.add(n3);
        n2.neighbors.add(n1); n3.neighbors.add(n1);
        GraphNode clone = CloneGraph.cloneGraph(n1);
        assertNotNull(clone);
        assertEquals(1, clone.val);
        assertEquals(2, clone.neighbors.size());
    }
}
