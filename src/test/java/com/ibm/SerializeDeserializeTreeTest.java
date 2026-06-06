package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class SerializeDeserializeTreeTest {
    @Test
    public void exampleTest() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        String s = SerializeDeserializeTree.serialize(root);
        TreeNode out = SerializeDeserializeTree.deserialize(s);
        assertEquals(1, out.val);
        assertEquals(3, out.right.val);
    }
}
