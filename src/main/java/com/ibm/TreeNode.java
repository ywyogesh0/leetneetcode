package com.ibm;

/**
 * Simple binary tree node used by tree problems.
 *
 * Input: `TreeNode` instances are used as roots or children in tree algorithms.
 * Output/Representation: node with `val` and `left`/`right` child references.
 * Example: new TreeNode(1, new TreeNode(2), new TreeNode(3)) represents [1,2,3].
 * Approach: helper container; tree algorithms traverse/modify `TreeNode` structures.
 *
 * Visual Illustration:
 * 1) new TreeNode(1, new TreeNode(2), new TreeNode(3)) represents tree with root 1 and children 2,3
 * 2) traversal preorder -> 1,2,3
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
}
