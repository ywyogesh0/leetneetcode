package com.ibm;

import java.util.*;

/**
 * Problem 7: Level Order Traversal (BFS)
 *
 * Input: root of a binary tree (`TreeNode`).
 * Output: List of levels where each level is a list of integers.
 * Example: root = [3,9,20,null,null,15,7] -> [[3],[9,20],[15,7]]
 *
 * Approach: BFS with a queue; process nodes level-by-level.
 *
 * Visual Illustration (root=[3,9,20,null,null,15,7]):
 * 1) queue=[3] -> process level -> output [3]
 * 2) enqueue children 9,20 -> process -> output [9,20]
 * 3) enqueue children 15,7 -> process -> output [15,7]
 */
public class LevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            result.add(level);
        }
        return result;
    }
}
