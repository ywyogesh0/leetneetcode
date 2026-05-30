package com.leetneetcode.datastructures.topinterview150.trees;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DeleteNodeBSTTest {

    @Test
    public void testDeleteLeafNode() {
        /*
         * Visual BST:
         *      5
         *     / \
         *    3   7
         *   / \
         *  2   4
         *
         * Delete: 2 (leaf)
         * Expected inorder: [3, 4, 5, 7]
         */

        DeleteNodeBST sol = new DeleteNodeBST();
        DeleteNodeBST.BSTNode root = null;
        int[] vals = { 5, 3, 7, 2, 4 };
        for (int v : vals)
            root = sol.insert(root, v);

        root = sol.deleteNode(root, 2);

        List<Integer> inorder = sol.inorder(root);
        assertEquals(Arrays.asList(3, 4, 5, 7), inorder);
    }

    @Test
    public void testDeleteNodeWithOneChild() {
        /*
         * Visual BST:
         *      5
         *     / \
         *    3   8
         *     \   \
         *      4   9
         *
         * Delete: 3 (has one right child 4)
         * Expected inorder: [4, 5, 8, 9]
         */

        DeleteNodeBST sol = new DeleteNodeBST();
        DeleteNodeBST.BSTNode root = null;
        int[] vals = { 5, 3, 8, 4, 9 };
        for (int v : vals)
            root = sol.insert(root, v);

        root = sol.deleteNode(root, 3);

        List<Integer> inorder = sol.inorder(root);
        assertEquals(Arrays.asList(4, 5, 8, 9), inorder);
    }

    @Test
    public void testDeleteNodeWithTwoChildren() {
        /*
         * Visual BST:
         *       15
         *      /  \
         *     10   20
         *    / \  / \
         *   8  12 17 25
         *
         * Delete: 10 (two children)
         * Expected inorder after deletion: [8, 12, 15, 17, 20, 25]
         */

        DeleteNodeBST sol = new DeleteNodeBST();
        DeleteNodeBST.BSTNode root = null;
        int[] vals = { 15, 10, 20, 8, 12, 17, 25 };
        for (int v : vals)
            root = sol.insert(root, v);

        root = sol.deleteNode(root, 10);

        List<Integer> inorder = sol.inorder(root);
        assertEquals(Arrays.asList(8, 12, 15, 17, 20, 25), inorder);
    }

    @Test
    public void testDeleteRootNode() {
        /*
         * Visual BST:
         *      6
         *     / \
         *    4   8
         *   / \   \
         *  3   5   9
         *
         * Delete: 6 (root)
         * Expected inorder after deletion: [3, 4, 5, 8, 9]
         */

        DeleteNodeBST sol = new DeleteNodeBST();
        DeleteNodeBST.BSTNode root = null;
        int[] vals = { 6, 4, 8, 3, 5, 9 };
        for (int v : vals)
            root = sol.insert(root, v);

        root = sol.deleteNode(root, 6);

        List<Integer> inorder = sol.inorder(root);
        assertEquals(Arrays.asList(3, 4, 5, 8, 9), inorder);
    }

    @Test
    public void testDeleteNonExistentNode() {
        /*
         * Visual BST:
         *      4
         *     / \
         *    2   6
         *
         * Delete: 10 (not in tree)
         * Expected inorder unchanged: [2, 4, 6]
         */

        DeleteNodeBST sol = new DeleteNodeBST();
        DeleteNodeBST.BSTNode root = null;
        int[] vals = { 4, 2, 6 };
        for (int v : vals)
            root = sol.insert(root, v);

        root = sol.deleteNode(root, 10);

        List<Integer> inorder = sol.inorder(root);
        assertEquals(Arrays.asList(2, 4, 6), inorder);
    }
}
