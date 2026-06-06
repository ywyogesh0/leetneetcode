package com.ibm;

import java.util.*;

/**
 * Problem 39: Topological Sort (Kahn's algorithm)
 *
 * Input: number of courses `n` and `prerequisites` pairs [a,b] meaning b->a.
 * Output: one possible topological order of courses or empty if cycle exists.
 * Example: n=2, prerequisites=[[1,0]] -> [0,1]
 *
 * Approach: Kahn's algorithm (BFS) using in-degree counts and a queue.
 *
 * Visual Illustration (n=2, prerequisites=[[1,0]]):
 * 1) inDegree=[0,1], queue=[0]
 * 2) pop 0 -> append to order -> reduce inDegree[1] to 0 -> enqueue 1
 * 3) pop 1 -> order=[0,1] returned
 */
public class TopologicalSort {
    public static int[] findOrder(int n, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[n];
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]);
            inDegree[pre[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) if (inDegree[i] == 0) q.offer(i);
        int[] order = new int[n]; int idx = 0;
        while (!q.isEmpty()) {
            int node = q.poll(); order[idx++] = node;
            for (int next : graph.get(node)) if (--inDegree[next] == 0) q.offer(next);
        }
        return idx == n ? order : new int[]{};
    }
}
