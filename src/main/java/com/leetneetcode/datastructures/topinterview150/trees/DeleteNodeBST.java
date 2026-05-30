package com.leetneetcode.datastructures.topinterview150.trees;

import java.util.ArrayList;
import java.util.List;

public class DeleteNodeBST {

    /**
     * Helper method to insert a value into the BST (recursive).
     */
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

    /**
     * Inorder traversal (left, root, right) returning node values as a list.
     */
    public List<Integer> inorder(BSTNode root) {
        List<Integer> res = new ArrayList<>();
        inorderHelper(root, res);
        return res;
    }

    private void inorderHelper(BSTNode node, List<Integer> out) {
        if (node == null)
            return;
        inorderHelper(node.leftNode, out);
        out.add(node.data);
        inorderHelper(node.rightNode, out);
    }

    /**
     * Deletes a node with the given key from the BST and returns the new root.
     */
    public BSTNode deleteNode(BSTNode root, int key) {
        if (null == root)
            return root;

        if (key < root.data) {
            root.leftNode = deleteNode(root.leftNode, key);
        } else if (key > root.data) {
            root.rightNode = deleteNode(root.rightNode, key);
        } else {
            // Node with no child: leaf node
            if (null == root.leftNode && null == root.rightNode) {
                return null;
            }
            // Node with one child: either left or right
            if (null == root.leftNode) {
                return root.rightNode;
            } else if (null == root.rightNode) {
                return root.leftNode;
            } else {
                // Node with two children: Get the inorder successor (smallest in the right
                // subtree)
                BSTNode successor = getMin(root.rightNode);
                // Copy the successor's value to this node
                root.data = successor.data;
                // Delete the successor
                root.rightNode = deleteNode(root.rightNode, successor.data);
            }
        }

        return root;
    }

    private BSTNode getMin(BSTNode rightNode) {
        while (rightNode.leftNode != null) {
            rightNode = rightNode.leftNode;
        }
        return rightNode;
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
