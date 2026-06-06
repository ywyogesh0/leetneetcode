package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxDepthBinaryTreeTest {
    @Test
    public void exampleTest() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(3, MaxDepthBinaryTree.maxDepth(root));
    }
}
