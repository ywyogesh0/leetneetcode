package com.ibm;

/**
 * Problem 49: Union-Find (Disjoint Sets)
 *
 * Input: initialization size `n` and union/find operations.
 * Output: ability to query connected components and union sets.
 * Example: union(0,1); find(1) -> 0 (root representative)
 *
 * Approach: union by rank with path compression for near-constant amortized operations.
 *
 * Visual Illustration (n=4):
 * 1) parent=[0,1,2,3]
 * 2) union(0,1) -> parent[1]=0
 * 3) union(2,3) -> parent[3]=2
 * 4) union(1,3) -> merge sets -> representative updated accordingly
 */
public class UnionFind {
    int[] parent, rank;
    int components;
    public UnionFind(int n) {
        parent = new int[n]; rank = new int[n]; components = n;
        for (int i = 0; i < n; i++) parent[i] = i;
    }
    public int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }
    public boolean union(int x, int y) {
        int px = find(x), py = find(y);
        if (px == py) return false;
        if (rank[px] < rank[py]) { int t = px; px = py; py = t; }
        parent[py] = px;
        if (rank[px] == rank[py]) rank[px]++;
        components--;
        return true;
    }
}
