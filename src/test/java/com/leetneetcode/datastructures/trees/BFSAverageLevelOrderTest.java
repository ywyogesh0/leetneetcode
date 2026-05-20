package com.leetneetcode.datastructures.trees;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.List;

public class BFSAverageLevelOrderTest {
    
    @Test
    public void testAverageLevelOrder_inVisualBST() {
        /*
         * Visual BST:
         *
         *      8
         *     / \
         *    3   10
         *   / \    \
         *  1   6    14
         */

        BFSAverageLevelOrder bfs = new BFSAverageLevelOrder();
        BFSAverageLevelOrder.BSTNode root = null;
        root = bfs.insert(root, 8);
        root = bfs.insert(root, 3);
        root = bfs.insert(root, 10);
        root = bfs.insert(root, 1);
        root = bfs.insert(root, 6);
        root = bfs.insert(root, 14);

        List<Double> averageLevelOrder = bfs.avglevelOrder(root);

        System.out.println("Average level order traversal of the BST: " + averageLevelOrder);
        assertEquals(3, averageLevelOrder.size());
        assertEquals(8.00000, averageLevelOrder.get(0), 0);
        assertEquals(6.50000, averageLevelOrder.get(1), 0);
        assertEquals(7.00000, averageLevelOrder.get(2), 0);
    }
}