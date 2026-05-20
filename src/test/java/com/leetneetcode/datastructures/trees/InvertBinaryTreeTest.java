package com.leetneetcode.datastructures.trees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InvertBinaryTreeTest {
    
    @Test
    public void testInvertTree_inVisualBST() {
        /*
         * Visual BST:
         *
         *      8
         *     / \
         *    3   10
         *   / \    \
         *  1   6    14
         */

        InvertBinaryTree invertTree = new InvertBinaryTree();
        InvertBinaryTree.BSTNode root = null;
        root = invertTree.insert(root, 8);
        root = invertTree.insert(root, 3);
        root = invertTree.insert(root, 10);
        root = invertTree.insert(root, 1);
        root = invertTree.insert(root, 6);
        root = invertTree.insert(root, 14);

        InvertBinaryTree.BSTNode invertedRoot = invertTree.invertTree(root);

        assertEquals(8, invertedRoot.data);
        assertEquals(10, invertedRoot.leftNode.data);
        assertEquals(3, invertedRoot.rightNode.data);
        assertEquals(14, invertedRoot.leftNode.leftNode.data);
        assertEquals(6, invertedRoot.rightNode.leftNode.data);
        assertEquals(1, invertedRoot.rightNode.rightNode.data);
    }
}