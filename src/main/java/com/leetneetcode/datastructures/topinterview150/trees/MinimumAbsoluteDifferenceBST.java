package com.leetneetcode.datastructures.topinterview150.trees;

public class MinimumAbsoluteDifferenceBST {

    // Helper insert to build BSTs in tests (matches project style)
    public BSTNode insert(BSTNode root, int value) {
        if (root == null)
            return new BSTNode(value);
        if (value < root.data)
            root.leftNode = insert(root.leftNode, value);
        else
            root.rightNode = insert(root.rightNode, value);
        return root;
    }

    // Returns minimum absolute difference between values of any two nodes in the
    // BST
    public int getMinimumAbsoluteDifference(BSTNode root) {
        Prev prev = new Prev();
        MinHolder min = new MinHolder(Integer.MAX_VALUE);
        inorder(root, prev, min);
        return min.value == Integer.MAX_VALUE ? 0 : min.value;
    }

    private void inorder(BSTNode node, Prev prev, MinHolder min) {
        if (node == null)
            return;
        inorder(node.leftNode, prev, min);
        if (prev.node != null) {
            int diff = Math.abs(node.data - prev.node.data);
            if (diff < min.value)
                min.value = diff;
        }
        prev.node = node;
        inorder(node.rightNode, prev, min);
    }

    // small wrappers to allow passing by reference
    static class Prev {
        BSTNode node;
    }

    static class MinHolder {
        int value;

        MinHolder(int v) {
            value = v;
        }
    }

    class BSTNode {
        int data;
        BSTNode leftNode;
        BSTNode rightNode;

        BSTNode(int data) {
            this.data = data;
        }
    }

    /**
     * Morris inorder traversal variant to compute minimum absolute difference
     * using O(1) extra space (mods the tree temporarily but restores it).
     */
    public int getMinimumAbsoluteDifferenceMorris(BSTNode root) {
        int min = Integer.MAX_VALUE;
        BSTNode current = root;
        BSTNode prevNode = null;

        while (current != null) {
            if (current.leftNode == null) {
                if (prevNode != null)
                    min = Math.min(min, Math.abs(current.data - prevNode.data));
                prevNode = current;
                current = current.rightNode;
            } else {
                BSTNode predecessor = current.leftNode;
                while (predecessor.rightNode != null && predecessor.rightNode != current) {
                    predecessor = predecessor.rightNode;
                }

                if (predecessor.rightNode == null) {
                    predecessor.rightNode = current;
                    current = current.leftNode;
                } else {
                    predecessor.rightNode = null; // restore
                    if (prevNode != null)
                        min = Math.min(min, Math.abs(current.data - prevNode.data));
                    prevNode = current;
                    current = current.rightNode;
                }
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
