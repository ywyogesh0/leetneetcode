package com.leetneetcode.datastructures.topinterview150.trees;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.List;

public class BFSLevelOrderTraversalTest {
    
    @Test
    public void testLevelOrder_inVisualBST() {
        /*
         * Visual BST:
         *
         *      8
         *     / \
         *    3   10
         *   / \    \
         *  1   6    14
         */

        BFSLevelOrderTraversal bfs = new BFSLevelOrderTraversal();
        BFSLevelOrderTraversal.BSTNode root = null;
        root = bfs.insert(root, 8);
        root = bfs.insert(root, 3);
        root = bfs.insert(root, 10);
        root = bfs.insert(root, 1);
        root = bfs.insert(root, 6);
        root = bfs.insert(root, 14);

        List<List<Integer>> levelOrder = bfs.levelOrder(root);

        System.out.println("Level order traversal of the BST: " + levelOrder);
        assertEquals(3, levelOrder.size());
    }
}