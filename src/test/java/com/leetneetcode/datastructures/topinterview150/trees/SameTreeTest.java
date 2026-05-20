package com.leetneetcode.datastructures.topinterview150.trees;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SameTreeTest {

    @Test
    public void testSameTree_withIdenticalTrees() {
        /*
         * Visual BST:
         *
         *      8
         *     / \
         *    3   10
         *   / \    \
         *  1   6    14
         */

        SameTree sameTree = new SameTree();
        SameTree.BSTNode p = null;
        p = sameTree.insert(p, 8);
        p = sameTree.insert(p, 3);
        p = sameTree.insert(p, 10);
        p = sameTree.insert(p, 1);
        p = sameTree.insert(p, 6);
        p = sameTree.insert(p, 14);

        SameTree.BSTNode q = null;
        q = sameTree.insert(q, 8);
        q = sameTree.insert(q, 3);
        q = sameTree.insert(q, 10);
        q = sameTree.insert(q, 1);
        q = sameTree.insert(q, 6);
        q = sameTree.insert(q, 14);

        assertTrue(sameTree.isSameTree(p, q));
    }

    @Test
    public void testSameTree_withBothNull() {
        SameTree sameTree = new SameTree();
        assertTrue(sameTree.isSameTree(null, null));
    }

    @Test
    public void testSameTree_withOneNull() {
        SameTree sameTree = new SameTree();
        SameTree.BSTNode p = sameTree.insert(null, 1);
        assertFalse(sameTree.isSameTree(p, null));
        assertFalse(sameTree.isSameTree(null, p));
    }

    @Test
    public void testSameTree_withDifferentValues() {
        /*
         * Tree p:
         *      8
         *     / \
         *    3   10
         *
         * Tree q:
         *      8
         *     / \
         *    3   12
         */

        SameTree sameTree = new SameTree();
        SameTree.BSTNode p = null;
        p = sameTree.insert(p, 8);
        p = sameTree.insert(p, 3);
        p = sameTree.insert(p, 10);

        SameTree.BSTNode q = null;
        q = sameTree.insert(q, 8);
        q = sameTree.insert(q, 3);
        q = sameTree.insert(q, 12);

        assertFalse(sameTree.isSameTree(p, q));
    }

    @Test
    public void testSameTree_withDifferentStructures() {
        /*
         * Tree p:
         *      8
         *     / \
         *    3   10
         *   /
         *  1
         *
         * Tree q:
         *      8
         *     / \
         *    3   10
         *         /
         *        9
         */

        SameTree sameTree = new SameTree();
        SameTree.BSTNode p = null;
        p = sameTree.insert(p, 8);
        p = sameTree.insert(p, 3);
        p = sameTree.insert(p, 10);
        p = sameTree.insert(p, 1);

        SameTree.BSTNode q = null;
        q = sameTree.insert(q, 8);
        q = sameTree.insert(q, 3);
        q = sameTree.insert(q, 10);
        q = sameTree.insert(q, 9);

        assertFalse(sameTree.isSameTree(p, q));
    }
}
