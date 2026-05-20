package com.leetneetcode.datastructures.topinterview150.trees;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SymmetricTreeTest {

    @Test
    public void testSymmetricTree_withSymmetricTree() {
        /*
         * Visual BST:
         *
         *      8
         *     / \
         *    3   3
         *   / \ / \
         *  1  6 6  1
         */

        SymmetricTree symmetricTree = new SymmetricTree();
        SymmetricTree.BSTNode root = null;
        root = symmetricTree.insert(root, 8);
        root = symmetricTree.insert(root, 3);
        root = symmetricTree.insert(root, 3);
        root = symmetricTree.insert(root, 1);
        root = symmetricTree.insert(root, 6);
        root = symmetricTree.insert(root, 6);
        root = symmetricTree.insert(root, 1);

        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    public void testSymmetricTree_withNullRoot() {
        SymmetricTree symmetricTree = new SymmetricTree();
        assertTrue(symmetricTree.isSymmetric(null));
    }

    @Test
    public void testSymmetricTree_withSingleRoot() {
        SymmetricTree symmetricTree = new SymmetricTree();
        SymmetricTree.BSTNode root = symmetricTree.insert(null, 5);
        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    public void testSymmetricTree_withAsymmetricValues() {
        /*
         * Tree:
         *      8
         *     / \
         *    3   3
         *   / \ / \
         *  1  6 4  1
         */

        SymmetricTree symmetricTree = new SymmetricTree();
        SymmetricTree.BSTNode root = null;
        root = symmetricTree.insert(root, 8);
        root = symmetricTree.insert(root, 3);
        root = symmetricTree.insert(root, 3);
        root = symmetricTree.insert(root, 1);
        root = symmetricTree.insert(root, 6);
        root = symmetricTree.insert(root, 4);
        root = symmetricTree.insert(root, 1);

        assertFalse(symmetricTree.isSymmetric(root));
    }

    @Test
    public void testSymmetricTree_withAsymmetricStructure() {
        /*
         * Tree:
         *      8
         *     / \
         *    3   3
         *   /    / \
         *  1    3   1
         */

        SymmetricTree symmetricTree = new SymmetricTree();
        SymmetricTree.BSTNode root = null;
        root = symmetricTree.insert(root, 8);
        root = symmetricTree.insert(root, 3);
        root = symmetricTree.insert(root, 3);
        root = symmetricTree.insert(root, 1);
        root = symmetricTree.insert(root, 3);
        root = symmetricTree.insert(root, 1);

        assertFalse(symmetricTree.isSymmetric(root));
    }
}
