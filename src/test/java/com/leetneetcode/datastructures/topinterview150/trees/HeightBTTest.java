package com.leetneetcode.datastructures.topinterview150.trees;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeightBTTest {
    
    @Test
    public void testFindHeight_inVisualBST() {
        /*
         * Visual BST:
         *
         *      8
         *     / \
         *    3   10
         *   / \    \
         *  1   6    14
         */

        HeightBT heightBT = new HeightBT();
        HeightBT.BSTNode root = null;
        root = heightBT.insert(root, 8);
        root = heightBT.insert(root, 3);
        root = heightBT.insert(root, 10);
        root = heightBT.insert(root, 1);
        root = heightBT.insert(root, 6);
        root = heightBT.insert(root, 14);

        int height = heightBT.height(root);

        System.out.println("Height of the BST: " + height);
        assertEquals(2, height);
    }
}