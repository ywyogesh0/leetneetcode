package com.ibm;

/**
 * Problem 8: Validate Binary Search Tree
 *
 * Input: root of a binary tree (`TreeNode`).
 * Output: boolean whether it satisfies BST properties (left < node < right everywhere).
 * Example: root = [2,1,3] -> true
 *
 * Approach: recursive bounds check (min/max) passed down the tree.
 *
 * Visual Illustration (root=[2,1,3]):
 * 1) start at root 2 with bounds (-inf, +inf)
 * 2) left child 1 must be in (-inf,2) -> valid
 * 3) right child 3 must be in (2,+inf) -> valid -> return true
 */
public class ValidateBST {
    public static boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private static boolean validate(TreeNode node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }
}
