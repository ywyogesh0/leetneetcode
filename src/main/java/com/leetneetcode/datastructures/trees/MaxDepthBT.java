package com.leetneetcode.datastructures.trees;

public class MaxDepthBT {

    /**
     * Find the maximum depth of a Binary Tree (BT).
     * 
     * Given the root of a binary tree, return its maximum depth.
     * 
     * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     * 
     * Visual BT:
     * 
     *       8
     *      / \
     *     3   10
     *    / \    \
     *   1   6    14
     */

    // Method to insert a value into the BST (recursive approach)
    public BSTNode insert(BSTNode root, int value) {
        if (null == root) {
            root = new BSTNode(value);
        } else if (value < root.data) {
            root.leftNode = insert(root.leftNode, value);
        } else {
            root.rightNode = insert(root.rightNode, value);
        }

        return root;
    }

    // Method to find the max depth of a binary tree
    public int maxDepth(BSTNode root) {
        if (root == null) {
            return 0;
        }

        int depthOfLeftSubTree = maxDepth(root.leftNode);
        int depthOfRightSubTree = maxDepth(root.rightNode);

        if (depthOfLeftSubTree > depthOfRightSubTree) {
            return depthOfLeftSubTree + 1;
        }

        return depthOfRightSubTree + 1;
    }

    class BSTNode {
        int data;
        BSTNode leftNode;
        BSTNode rightNode;

        BSTNode(int data) {
            this.data = data;
        }
    }
}
