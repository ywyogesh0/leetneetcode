package com.ibm;

import java.util.*;

/**
 * Problem 13: BFS / DFS on Graph (adjacency list)
 *
 * Input: graph represented as adjacency lists (Map<Integer,List<Integer>>) and a start node.
 * Output: traversal order (BFS example) as a list of node ids.
 * Example: graph {1:[2,3],2:[4]} start=1 -> [1,2,3,4]
 *
 * Approach: standard BFS/DFS using queue or recursion with visited set.
 *
 * Visual Illustration (graph {1:[2,3],2:[4]}, start=1):
 * 1) enqueue 1 -> order=[1]
 * 2) visit neighbors 2 and 3 -> enqueue 2,3 -> order adds 2,3
 * 3) visit 2's neighbor 4 -> enqueue 4 -> final order [1,2,3,4]
 */
public class GraphTraversal {
    public static List<Integer> bfs(Map<Integer, List<Integer>> graph, int start) {
        List<Integer> order = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(start); visited.add(start);
        while (!q.isEmpty()) {
            int node = q.poll(); order.add(node);
            for (int nei : graph.getOrDefault(node, List.of())) {
                if (!visited.contains(nei)) { visited.add(nei); q.offer(nei); }
            }
        }
        return order;
    }
}
