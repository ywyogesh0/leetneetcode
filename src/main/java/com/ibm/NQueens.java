package com.ibm;

import java.util.*;

/**
 * Problem 34: N-Queens
 *
 * Input: integer `n` representing n x n chessboard.
 * Output: all distinct solutions where n queens are placed without attacking each other.
 * Example: n=4 -> 2 solutions with board representations.
 *
 * Approach: backtracking with column and diagonal sets to prune invalid placements.
 *
 * Visual Illustration (n=4):
 * 1) place Q at row0,col1 -> board[0] ".Q.."
 * 2) next row try positions avoiding same column/diagonals -> place Q at row1,col3
 * 3) backtrack/advance to find full solutions like [".Q..","...Q","Q...","..Q."]
 */
public class NQueens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        Set<Integer> cols = new HashSet<>(), d1 = new HashSet<>(), d2 = new HashSet<>();
        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');
        backtrack(0, n, board, cols, d1, d2, res);
        return res;
    }
    private static void backtrack(int row, int n, char[][] board, Set<Integer> cols, Set<Integer> d1, Set<Integer> d2, List<List<String>> res) {
        if (row == n) { addSolution(board, res); return; }
        for (int col = 0; col < n; col++) {
            if (cols.contains(col) || d1.contains(row-col) || d2.contains(row+col)) continue;
            board[row][col] = 'Q'; cols.add(col); d1.add(row-col); d2.add(row+col);
            backtrack(row+1, n, board, cols, d1, d2, res);
            board[row][col] = '.'; cols.remove(col); d1.remove(row-col); d2.remove(row+col);
        }
    }
    private static void addSolution(char[][] board, List<List<String>> res) {
        List<String> sol = new ArrayList<>();
        for (char[] row : board) sol.add(new String(row));
        res.add(sol);
    }
}
