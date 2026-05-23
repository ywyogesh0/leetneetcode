package com.leetneetcode.datastructures.topinterview150.trees;

import java.util.LinkedList;
import java.util.Queue;

public class CountCompleteTreeNodes {

    /**
     * Given the root of a complete binary tree, return the number of nodes in the tree.
     *
     * A complete binary tree is completely filled on all levels except possibly the last,
     * and all nodes in the last level are as far left as possible.
     *
     * Example complete binary tree:
     *
     *          1
     *         / \
     *        2   3
     *       / \  /
     *      4  5 6
     *
     * Solution explanation:
     * - For a node, compute the height of its left and right subtrees by following
     *   left-child pointers only (this gives leftmost heights).
     * 
     * - If leftHeight == rightHeight then the left subtree is a perfect binary tree
     *   of height `leftHeight` and contains (2^leftHeight - 1) nodes. Counting the
     *   root adds one more, so the root+left-subtree total is 2^leftHeight. We then
     *   recurse on the right subtree to count remaining nodes.
     * 
     * - If leftHeight != rightHeight then the right subtree is perfect of height
     *   `rightHeight` and contains (2^rightHeight - 1) nodes. Counting the root gives
     *   2^rightHeight nodes for root+right-subtree, and we recurse on the left subtree.
     *
     * Complexity:
     * - The `height` helper runs in O(h) where h is tree height (h = O(log n)).
     * 
     * - Each recursive `countNodes` call performs two height computations and then
     *   recurses on one subtree only. There are O(h) recursive levels, so overall
     *   time is O(h * h) = O((log n)^2).
     * 
     * - Space is O(h) due to recursion stack.
     *
     * Note: a simple DFS count (provided as `countNodesSimple`) runs in O(n) time
     * and is useful when algorithmic optimization is not required.
     * 
     */
    public int countNodes(BSTNode root) {
        if (null == root) {
            return 0;
        }

        int leftHeight = height(root.leftNode);
        int rightHeight = height(root.rightNode);

        if (leftHeight == rightHeight) {
            return (1 << leftHeight) + countNodes(root.rightNode);
        } else {
            return (1 << rightHeight) + countNodes(root.leftNode);
        }
    }

    // Simple O(n) node-count using depth-first traversal.
    public int countNodesSimple(BSTNode root) {
        if (null == root) {
            return 0;
        }
        return 1 + countNodesSimple(root.leftNode) + countNodesSimple(root.rightNode);
    }

    private int height(BSTNode node) {
        int height = 0;
        while (null != node) {
            height++;
            node = node.leftNode;
        }
        return height;
    }

    // Helper to insert nodes in level order so test trees can be built as complete trees.
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
            }
            queue.add(node.leftNode);

            if (null == node.rightNode) {
                node.rightNode = new BSTNode(value);
                return root;
            }
            queue.add(node.rightNode);
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
