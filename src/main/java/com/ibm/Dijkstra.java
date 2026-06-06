package com.ibm;

import java.util.*;

/**
 * Problem 15: Dijkstra's shortest paths (adjacency matrix version)
 *
 * Input: graph represented as adjacency matrix or list and a source vertex.
 * Output: shortest distances from source to all vertices.
 * Example: weighted adjacency matrix -> returns distance array.
 *
 * Approach: standard Dijkstra using a priority queue (or simple O(V^2) selection for matrix).
 *
 * Visual Illustration (example adjacency matrix with 3 nodes):
 * 1) start at source 0, distances=[0,inf,inf]
 * 2) relax neighbors of 0 -> update distances, pick next smallest unvisited
 * 3) continue until all nodes finalized with shortest distances
 */
public class Dijkstra {
    public static int[] dijkstra(int[][] graph, int src) {
        int n = graph.length;
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{src,0});
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int u = cur[0], d = cur[1];
            if (d > dist[u]) continue;
            for (int v = 0; v < n; v++) {
                if (graph[u][v] != 0 && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                    pq.offer(new int[]{v, dist[v]});
                }
            }
        }
        return dist;
    }
}
