package com.ibm;

/**
 * Problem 6: Maximum Depth of Binary Tree
 *
 * Input: root node of a binary tree (`TreeNode`).
 * Output: integer maximum depth (height) of the tree.
 * Example: root = [3,9,20,null,null,15,7] -> returns 3
 *
 * Approach: recursive DFS returning 1 + max(leftDepth, rightDepth).
 *
 * Visual Illustration (root=[3,9,20,null,null,15,7]):
 * 1) compute depth of left subtree (9) -> 1
 * 2) compute depth of right subtree (20 with children 15,7) -> 2
 * 3) depth at root = 1 + max(1,2) = 3
 */
public class MaxDepthBinaryTree {
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left, right);
    }
}
