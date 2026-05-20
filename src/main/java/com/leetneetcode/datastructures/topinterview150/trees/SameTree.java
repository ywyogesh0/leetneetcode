package com.leetneetcode.datastructures.topinterview150.trees;

public class SameTree {

    /**
     * Check if two binary trees are identical.
     * 
     * Visual BT:
     * 
     *       8
     *      / \
     *     3   10
     *    / \    \
     *   1   6    14
     * 
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

    // Method to check if two binary trees are identical
    public boolean isSameTree(BSTNode p, BSTNode q) {
        if (null == p && null == q) {
            return true;
        }
        if (null == p || null == q) {
            return false;
        }
        if (p.data != q.data) {
            return false;
        }
        return isSameTree(p.leftNode, q.leftNode) && isSameTree(p.rightNode, q.rightNode);
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
