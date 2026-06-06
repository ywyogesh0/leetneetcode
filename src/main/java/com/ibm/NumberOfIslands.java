package com.ibm;

/**
 * Problem 14: Number of Islands
 *
 * Input: 2D grid of characters '1' (land) and '0' (water).
 * Output: number of distinct islands (connected groups of '1's).
 * Example: [["1","1","0"],["1","0","0"],["0","0","1"]] -> 2
 *
 * Approach: DFS/BFS to mark visited land cells and count connected components.
 *
 * Visual Illustration (grid=[["1","1","0"],["1","0","0"],["0","0","1"]]):
 * 1) find first '1' at (0,0) -> dfs marks connected cells (0,0),(0,1),(1,0) -> count=1
 * 2) find next unvisited '1' at (2,2) -> dfs marks it -> count=2
 */
public class NumberOfIslands {
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    private static void dfs(char[][] grid, int i, int j) {
        if (i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] != '1') return;
        grid[i][j] = '0';
        dfs(grid, i+1, j); dfs(grid, i-1, j); dfs(grid, i, j+1); dfs(grid, i, j-1);
    }
}
