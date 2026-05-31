package com.leetneetcode.datastructures.topinterview150.trees;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SubtreeOfAnotherTreeTest {

    @Test
    public void testExample1_subtreeExists() {
        // root = [3,4,5,1,2], subRoot = [4,1,2] -> true
        SubtreeOfAnotherTree sol = new SubtreeOfAnotherTree();
        SubtreeOfAnotherTree.BSTNode root = sol.new BSTNode(3);
        root.leftNode = sol.new BSTNode(4);
        root.rightNode = sol.new BSTNode(5);
        root.leftNode.leftNode = sol.new BSTNode(1);
        root.leftNode.rightNode = sol.new BSTNode(2);

        SubtreeOfAnotherTree.BSTNode subRoot = sol.new BSTNode(4);
        subRoot.leftNode = sol.new BSTNode(1);
        subRoot.rightNode = sol.new BSTNode(2);

        assertTrue(sol.isSubtree(root, subRoot));
    }

    @Test
    public void testExample2_notSubtree() {
        // root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2] -> false
        SubtreeOfAnotherTree sol = new SubtreeOfAnotherTree();
        SubtreeOfAnotherTree.BSTNode root = sol.new BSTNode(3);
        root.leftNode = sol.new BSTNode(4);
        root.rightNode = sol.new BSTNode(5);
        root.leftNode.leftNode = sol.new BSTNode(1);
        root.leftNode.rightNode = sol.new BSTNode(2);
        // place a "0" as the left child of the node with value 2 (index 9 in array)
        root.leftNode.rightNode.leftNode = sol.new BSTNode(0);

        SubtreeOfAnotherTree.BSTNode subRoot = sol.new BSTNode(4);
        subRoot.leftNode = sol.new BSTNode(1);
        subRoot.rightNode = sol.new BSTNode(2);

        assertFalse(sol.isSubtree(root, subRoot));
    }
}
