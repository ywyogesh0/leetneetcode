package com.ibm;

import java.util.*;

/**
 * Problem 37: Serialize / Deserialize Binary Tree
 *
 * Input: root of a binary tree (`TreeNode`) or a serialization string produced by `serialize`.
 * Output: `serialize` returns a string; `deserialize` returns the reconstructed `TreeNode` root.
 * Example: root = [1,2,3,null,null,4,5] -> serialize -> "1,2,null,null,3,4,null,null,5,null,null,"
 *
 * Approach: use preorder traversal with explicit null markers for serialization; consume tokens for deserialization.
 *
 * Visual Illustration (root=[1,2,3,null,null,4,5]):
 * 1) serialize pre-order: visit 1 -> "1," then left subtree 2 -> "2,null,null," then right subtree 3 -> "3,4,null,null,5,null,null,"
 * 2) full serialization: "1,2,null,null,3,4,null,null,5,null,null,"
 * 3) deserialize: queue tokens and rebuild nodes in same preorder sequence.
 */
public class SerializeDeserializeTree {
    public static String serialize(TreeNode root) {
        if (root == null) return "null,";
        return root.val + "," + serialize(root.left) + serialize(root.right);
    }
    public static TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList<>(Arrays.asList(data.split(",")));
        return buildTree(q);
    }
    private static TreeNode buildTree(Queue<String> q) {
        String val = q.poll();
        if (val.equals("null")) return null;
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = buildTree(q);
        node.right = buildTree(q);
        return node;
    }
}
