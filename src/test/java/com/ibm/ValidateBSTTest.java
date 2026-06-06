package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidateBSTTest {
    @Test
    public void exampleTest() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertTrue(ValidateBST.isValidBST(root));
    }
}
