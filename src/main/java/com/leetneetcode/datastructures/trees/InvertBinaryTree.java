package com.leetneetcode.datastructures.trees;

public class InvertBinaryTree {

    /**
     * Invert a binary tree by swapping the left and right child nodes of each node in the tree recursively and return the root of the inverted tree.
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

    // Method to invert a binary tree by swapping the left and right child nodes of
    // each node in the tree recursively
    public BSTNode invertTree(BSTNode root) {
        if (null == root) {
            return null;
        }

        BSTNode temp;

        temp = root.leftNode;
        root.leftNode = root.rightNode;
        root.rightNode = temp;

        invertTree(root.leftNode);
        invertTree(root.rightNode);

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
