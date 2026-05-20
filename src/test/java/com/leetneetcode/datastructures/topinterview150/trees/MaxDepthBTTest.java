package com.leetneetcode.datastructures.topinterview150.trees;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxDepthBTTest {
    
    @Test
    public void testFindMaxDepth_inVisualBST() {
        /*
         * Visual BST:
         *
         *      8
         *     / \
         *    3   10
         *   / \    \
         *  1   6    14
         */

        MaxDepthBT maxDepthBT = new MaxDepthBT();
        MaxDepthBT.BSTNode root = null;
        root = maxDepthBT.insert(root, 8);
        root = maxDepthBT.insert(root, 3);
        root = maxDepthBT.insert(root, 10);
        root = maxDepthBT.insert(root, 1);
        root = maxDepthBT.insert(root, 6);
        root = maxDepthBT.insert(root, 14);

        int maxDepth = maxDepthBT.maxDepth(root);

        System.out.println("Max depth of the BST: " + maxDepth);
        assertEquals(3, maxDepth);
    }
}