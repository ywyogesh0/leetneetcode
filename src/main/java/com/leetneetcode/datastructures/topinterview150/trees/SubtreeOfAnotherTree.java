package com.leetneetcode.datastructures.topinterview150.trees;

public class SubtreeOfAnotherTree {

    /**
     * Checks whether `subRoot` is a subtree of `root`.
     */
    public boolean isSubtree(BSTNode root, BSTNode subRoot) {
        if (subRoot == null)
            return true;
        if (root == null)
            return false;

        if (isSameTree(root, subRoot))
            return true;

        return isSubtree(root.leftNode, subRoot) || isSubtree(root.rightNode, subRoot);
    }

    private boolean isSameTree(BSTNode s, BSTNode t) {
        if (s == null && t == null)
            return true;
        if (s == null || t == null)
            return false;
        if (s.data != t.data)
            return false;
        return isSameTree(s.leftNode, t.leftNode) && isSameTree(s.rightNode, t.rightNode);
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
