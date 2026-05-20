package com.leetneetcode.datastructures.topinterview150.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSLevelOrderTraversal {

    /**
     * Perform a breadth-first search (BFS) level order traversal of a binary tree and return the values of the nodes at each level as a list of lists.
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

    // Method to perform BFS level order traversal of a binary tree
    public List<List<Integer>> levelOrder(BSTNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (null == root) {
            return result;
        }

        Queue<BSTNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                BSTNode currentNode = queue.poll();
                currentLevel.add(currentNode.data);

                if (currentNode.leftNode != null) {
                    queue.offer(currentNode.leftNode);
                }
                if (currentNode.rightNode != null) {
                    queue.offer(currentNode.rightNode);
                }
            }

            result.add(currentLevel);
        }

        return result;
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
