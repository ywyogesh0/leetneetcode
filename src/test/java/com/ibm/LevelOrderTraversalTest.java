package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class LevelOrderTraversalTest {
    @Test
    public void exampleTest() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<List<Integer>> res = LevelOrderTraversal.levelOrder(root);
        assertEquals(Arrays.asList(Arrays.asList(3), Arrays.asList(9,20), Arrays.asList(15,7)), res);
    }
}
