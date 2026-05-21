package com.leetneetcode.datastructures.topinterview150.trees;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PathSumTest {

    @Test
    public void testPathSum_withValidPath() {
        /*
         * Visual BT:
         *
         *       8
         *      / \
         *     3   3
         *    / \ / \
         *   1  6 6  1
         *
         * Target Sum: 12 (path: 8 -> 3 -> 1)
         */

        PathSum pathSum = new PathSum();
        PathSum.BSTNode root = null;
        root = pathSum.insert(root, 8);
        root = pathSum.insert(root, 3);
        root = pathSum.insert(root, 3);
        root = pathSum.insert(root, 1);
        root = pathSum.insert(root, 6);
        root = pathSum.insert(root, 6);
        root = pathSum.insert(root, 1);

        assertTrue(pathSum.hasPathSum(root, 12));
    }
}
