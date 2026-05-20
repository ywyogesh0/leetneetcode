package com.leetneetcode.datastructures.topinterview150.trees;

public class SymmetricTree {

    /**
     * Check if a binary tree is symmetric around its center.
     *
     * Visual BT:
     *
     *       8
     *      / \
     *     3   3
     *    / \ / \
     *   1  6 6  1
     */

    // Method to insert a value into the binary tree using level-order insertion
    // so that insertion order matches the visual tree layout rather than BST order.
    public BSTNode insert(BSTNode root, int value) {
        if (null == root) {
            return new BSTNode(value);
        }

        java.util.Queue<BSTNode> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BSTNode node = queue.poll();
            if (null == node.leftNode) {
                node.leftNode = new BSTNode(value);
                return root;
            } else {
                queue.add(node.leftNode);
            }

            if (null == node.rightNode) {
                node.rightNode = new BSTNode(value);
                return root;
            } else {
                queue.add(node.rightNode);
            }
        }

        return root;
    }

    // Method to check if a binary tree is symmetric
    public boolean isSymmetric(BSTNode root) {
        if (null == root) {
            return true;
        }
        return isMirror(root.leftNode, root.rightNode);
    }

    private boolean isMirror(BSTNode left, BSTNode right) {
        if (null == left && null == right) {
            return true;
        }
        if (null == left || null == right) {
            return false;
        }
        if (left.data != right.data) {
            return false;
        }
        return isMirror(left.leftNode, right.rightNode) && isMirror(left.rightNode, right.leftNode);
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
