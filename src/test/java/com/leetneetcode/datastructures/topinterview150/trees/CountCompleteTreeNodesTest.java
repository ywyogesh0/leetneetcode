package com.leetneetcode.datastructures.topinterview150.trees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountCompleteTreeNodesTest {

    @Test
    public void testCountNodes_onCompleteTree() {
        /*
         * Visual complete binary tree:
         *
         *          1
         *         / \
         *        2   3
         *       / \  /
         *      4  5 6
         */
        CountCompleteTreeNodes counter = new CountCompleteTreeNodes();
        CountCompleteTreeNodes.BSTNode root = null;
        root = counter.insert(root, 1);
        root = counter.insert(root, 2);
        root = counter.insert(root, 3);
        root = counter.insert(root, 4);
        root = counter.insert(root, 5);
        root = counter.insert(root, 6);

        assertEquals(6, counter.countNodes(root));
    }

    @Test
    public void testCountNodesSimple_onCompleteTree() {
        /*
         * Visual complete binary tree:
         *
         *          1
         *         / \
         *        2   3
         *       / \  /
         *      4  5 6
         */
        CountCompleteTreeNodes counter = new CountCompleteTreeNodes();
        CountCompleteTreeNodes.BSTNode root = null;
        root = counter.insert(root, 1);
        root = counter.insert(root, 2);
        root = counter.insert(root, 3);
        root = counter.insert(root, 4);
        root = counter.insert(root, 5);
        root = counter.insert(root, 6);

        assertEquals(6, counter.countNodesSimple(root));
    }

    @Test
    public void testCountNodes_onEmptyTree() {
        CountCompleteTreeNodes counter = new CountCompleteTreeNodes();
        assertEquals(0, counter.countNodes(null));
    }

    @Test
    public void testCountNodes_onSingleNodeTree() {
        CountCompleteTreeNodes counter = new CountCompleteTreeNodes();
        CountCompleteTreeNodes.BSTNode root = counter.insert(null, 1);
        assertEquals(1, counter.countNodes(root));
    }
}
