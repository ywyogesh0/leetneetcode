package com.leetneetcode.datastructures.topinterview150.trees;

public class ValidBST {

    /**
     * Given the root of a binary tree, return true if it is a valid binary search tree.
     *
     * A valid BST must satisfy:
     * - left subtree values are strictly less than the node value
     * - right subtree values are strictly greater than the node value
     * - both left and right subtrees are also valid BSTs
     *
     * Visual BT (valid BST):
     *
     *      2
     *     / \
     *    1   3
     */
    public boolean isValidBST(BSTNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(BSTNode node, long lowerBound, long upperBound) {
        if (null == node) {
            return true;
        }

        if (node.data <= lowerBound || node.data >= upperBound) {
            return false;
        }

        return isValidBST(node.leftNode, lowerBound, node.data)
                && isValidBST(node.rightNode, node.data, upperBound);
    }

    /**
     * Helper to insert a value into a BST. This is useful for building test trees.
     */
    public BSTNode insert(BSTNode root, int value) {
        if (null == root) {
            return new BSTNode(value);
        }

        if (value < root.data) {
            root.leftNode = insert(root.leftNode, value);
        } else {
            root.rightNode = insert(root.rightNode, value);
        }

        return root;
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
