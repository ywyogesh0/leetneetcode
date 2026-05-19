package com.leetneetcode.datastructures.trees;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinMaxBSTTest {

    @Test
    public void testFindMinAndMax_inVisualBST() {
        /*
         * Visual BST:
         *
         *      8
         *     / \
         *    3   10
         *   / \    \
         *  1   6    14
         */

        MinMaxBST minMaxBST = new MinMaxBST();
        MinMaxBST.BSTNode root = null;
        root = minMaxBST.insert(root, 8);
        root = minMaxBST.insert(root, 3);
        root = minMaxBST.insert(root, 10);
        root = minMaxBST.insert(root, 1);
        root = minMaxBST.insert(root, 6);
        root = minMaxBST.insert(root, 14);

        int minValue = minMaxBST.findMin(root);
        int maxValue = minMaxBST.findMax(root);
        int minRecursiveValue = minMaxBST.findMinRecursive(root);
        int maxRecursiveValue = minMaxBST.findMaxRecursive(root);

        System.out.println("Minimum value in the BST: " + minValue);
        System.out.println("Maximum value in the BST: " + maxValue);
        System.out.println("Minimum value (recursive): " + minRecursiveValue);
        System.out.println("Maximum value (recursive): " + maxRecursiveValue);

        assertEquals(1, minValue);
        assertEquals(14, maxValue);
        assertEquals(1, minRecursiveValue);
        assertEquals(14, maxRecursiveValue);
    }
}