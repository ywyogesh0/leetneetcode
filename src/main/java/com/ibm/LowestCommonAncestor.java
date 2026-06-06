package com.ibm;

/**
 * Problem 29: Lowest Common Ancestor in Binary Tree
 *
 * Input: root of binary tree and two nodes `p` and `q`.
 * Output: the lowest common ancestor node.
 * Example: root=[3,5,1,6,2,0,8], p=5, q=1 -> returns 3
 *
 * Approach: recursive DFS returning non-null when p or q found; LCA is root where both sides return non-null.
 *
 * Visual Illustration (root=[3,5,1,6,2,0,8], p=5, q=1):
 * 1) search left subtree for p and q -> finds p
 * 2) search right subtree -> finds q
 * 3) since both sides return non-null at root 3, LCA is 3
 */
public class LowestCommonAncestor {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
}
