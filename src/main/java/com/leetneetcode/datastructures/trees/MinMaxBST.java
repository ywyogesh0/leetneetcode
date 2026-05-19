package com.leetneetcode.datastructures.trees;

/**
 * Find the minimum and maximum value in a Binary Search Tree (BST).
 * 
 * Visual BST:
 * 
 *      8
 *     / \
 *    3   10
 *   / \    \
 *  1   6    14
 * 
 */
public class MinMaxBST {

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

    // Method to find the minimum value in a BST (iterative approach)
    public int findMin(BSTNode root) {
        if(null == root) {
            return -1;
        }
        while (null != root.leftNode) {
            root = root.leftNode;
        }
        return root.data;
    }

    // Method to find the minimum value in a BST (recursive approach)
    public int findMinRecursive(BSTNode root) {
        if (null == root) {
            return -1;
        }
        if (null == root.leftNode) {
            return root.data;
        }
        return findMinRecursive(root.leftNode);
    }

    // Method to find the maximum value in a BST (iterative approach)
    public int findMax(BSTNode root) {
         if(null == root) {
            return -1;
        }
        while (null != root.rightNode) {
            root = root.rightNode;
        }
        return root.data;
    }

    // Method to find the maximum value in a BST (recursive approach)
    public int findMaxRecursive(BSTNode root) {
        if (null == root) {
            return -1;
        }
        if (null == root.rightNode) {
            return root.data;
        }
        return findMaxRecursive(root.rightNode);
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
