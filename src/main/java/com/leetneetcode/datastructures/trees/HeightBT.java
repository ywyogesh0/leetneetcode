package com.leetneetcode.datastructures.trees;


public class HeightBT {

/**
 * Find the height of a Binary Tree (BT).
 * 
 * Visual BT:
 * 
 *      8
 *     / \
 *    3   10
 *   / \    \
 *  1   6    14
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

// Method to find the height of a binary tree
public int height(BSTNode root) {
    if (root == null) {
        return -1;
    }

    int leftHeight = height(root.leftNode);
    int rightHeight = height(root.rightNode);

    return Math.max(leftHeight, rightHeight) + 1;
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
