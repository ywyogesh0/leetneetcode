package com.leetneetcode.datastructures.topinterview150.trees;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidBSTTest {

    @Test
    public void testIsValidBST_withValidBST() {
        ValidBST validator = new ValidBST();
        ValidBST.BSTNode root = null;

        root = validator.insert(root, 2);
        root = validator.insert(root, 1);
        root = validator.insert(root, 3);

        assertTrue(validator.isValidBST(root));
    }

    @Test
    public void testIsValidBST_withInvalidBST() {
        ValidBST validator = new ValidBST();
        ValidBST.BSTNode root = validator.new BSTNode(5);
        root.leftNode = validator.new BSTNode(1);
        root.rightNode = validator.new BSTNode(4);
        root.rightNode.leftNode = validator.new BSTNode(3);
        root.rightNode.rightNode = validator.new BSTNode(6);

        assertFalse(validator.isValidBST(root));
    }

    @Test
    public void testIsValidBST_withInvalidLevel7ZigZagBST() {
        ValidBST validator = new ValidBST();

        // Visual Tree:
        //             50
        //               \
        //                80
        //               /
        //             60
        //               \
        //                70
        //               /
        //             65
        //               \
        //                68
        //               /
        //             45   <-- invalid because 45 is in the right subtree of 50
        ValidBST.BSTNode root = validator.new BSTNode(50);
        root.rightNode = validator.new BSTNode(80);
        root.rightNode.leftNode = validator.new BSTNode(60);
        root.rightNode.leftNode.rightNode = validator.new BSTNode(70);
        root.rightNode.leftNode.rightNode.leftNode = validator.new BSTNode(65);
        root.rightNode.leftNode.rightNode.leftNode.rightNode = validator.new BSTNode(68);
        root.rightNode.leftNode.rightNode.leftNode.rightNode.leftNode = validator.new BSTNode(45);

        assertFalse(validator.isValidBST(root));
    }
}
