package com.leetneetcode.datastructures.topinterview150.trees;

import java.util.LinkedList;
import java.util.Queue;

public class PathSum {

    /**
     * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path
     * such that adding up all the values along the path equals targetSum.
     *
     * A leaf is a node with no children.
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
    public BSTNode insert(BSTNode root, int value) {
        if (null == root) {
            return new BSTNode(value);
        }

        Queue<BSTNode> queue = new LinkedList<>();
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

    // Method to check if there exists a root-to-leaf path with the given target sum
    public boolean hasPathSum(BSTNode root, int targetSum) {
        if (null == root) {
            return false;
        }
        return hasPath(root, targetSum);
    }

    private boolean hasPath(BSTNode node, int remainingSum) {
        // base condition 1: no child
        if(null == node) return false;

        // base condition 2: leaf node
        if (null == node.leftNode && null == node.rightNode) {
            return node.data == remainingSum;
        }

        int newSum = remainingSum - node.data;

        // Recursively check left and right subtrees
        return hasPath(node.leftNode, newSum) || hasPath(node.rightNode, newSum);
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
