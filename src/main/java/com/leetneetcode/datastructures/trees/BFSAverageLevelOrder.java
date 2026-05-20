package com.leetneetcode.datastructures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BFSAverageLevelOrder {

    /**
     * Perform a breadth-first search (BFS) level order traversal of a binary tree and return the average value of the nodes at each level as a list of doubles.
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

    // Method to perform BFS level order traversal of a binary tree and return the
    // average value of the nodes at each level
    public List<Double> avglevelOrder(BSTNode root) {
        List<Double> avgOfLevels = new ArrayList<>();

        Queue<BSTNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;

            for (int i = 0; i < size; i++) {
                BSTNode node = queue.poll();

                if (null != node.leftNode) {
                    queue.offer(node.leftNode);
                }

                if (null != node.rightNode) {
                    queue.offer(node.rightNode);
                }

                sum = sum + node.data;
            }

            avgOfLevels.add(sum / size);
        }

        return avgOfLevels;
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
