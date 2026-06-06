package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class LowestCommonAncestorTest {
    @Test
    public void exampleTest() {
        TreeNode root = new TreeNode(3,
                new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                new TreeNode(1, new TreeNode(0), new TreeNode(8)));
        TreeNode p = root.left; // 5
        TreeNode q = root.left.right.right; // 4
        assertEquals(5, LowestCommonAncestor.lowestCommonAncestor(root, p, q).val);
    }
}
