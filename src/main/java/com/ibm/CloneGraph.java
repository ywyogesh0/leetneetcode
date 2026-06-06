package com.ibm;

import java.util.*;

/**
 * Problem 44: Clone Graph
 *
 * Input: a reference to a node in an undirected graph using `GraphNode`.
 * Output: deep copy (clone) of the graph and returned node reference.
 * Example: node with neighbors -> cloned node with copied neighbor objects.
 *
 * Approach: DFS/BFS with a map from original to cloned nodes to avoid duplication.
 *
 * Visual Illustration (simple 3-node graph 1-2,1-3):
 * 1) start clone at node1 -> create clone1 and map orig1->clone1
 * 2) visit neighbor 2 -> create clone2 and link clone1.neighbors.add(clone2)
 * 3) visit neighbor 3 -> create clone3 and link clone1.neighbors.add(clone3)
 * 4) returned cloned graph mirrors structure with distinct objects
 */
public class CloneGraph {
    public static GraphNode cloneGraph(GraphNode node) {
        if (node == null) return null;
        Map<GraphNode, GraphNode> visited = new HashMap<>();
        return dfs(node, visited);
    }
    private static GraphNode dfs(GraphNode node, Map<GraphNode, GraphNode> visited) {
        if (visited.containsKey(node)) return visited.get(node);
        GraphNode clone = new GraphNode(node.val);
        visited.put(node, clone);
        for (GraphNode nei : node.neighbors) clone.neighbors.add(dfs(nei, visited));
        return clone;
    }
}
