package com.ibm;

import java.util.ArrayList;
import java.util.List;

/**
 * Graph node utility used for adjacency-list graph problems.
 *
 * Input: used as a vertex container with integer `val` and `neighbors` list.
 * Output/Usage: passed to graph algorithms (BFS/DFS/clone) and returned when cloning/traversing.
 * Example: new GraphNode(1) with neighbors [2,3].
 * Approach: simple data holder; algorithms should use a map to track visited clones when copying.
 *
 * Visual Illustration:
 * 1) create node1 = new GraphNode(1); node2 = new GraphNode(2)
 * 2) node1.neighbors.add(node2) represents edge 1->2
 * 3) use in algorithms as starting points for BFS/DFS
 */
public class GraphNode {
    public int val;
    public List<GraphNode> neighbors;
    public GraphNode(int val) { this.val = val; this.neighbors = new ArrayList<>(); }
}
