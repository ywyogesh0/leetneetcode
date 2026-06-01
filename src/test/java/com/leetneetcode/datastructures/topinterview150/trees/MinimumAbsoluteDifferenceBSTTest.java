package com.leetneetcode.datastructures.topinterview150.trees;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumAbsoluteDifferenceBSTTest {

    @Test
    public void testExample1_smallTree() {
        // BST: [4,2,6,1,3] -> minimum diff is 1 (between 2 and 3 or 1 and 2)
        MinimumAbsoluteDifferenceBST sol = new MinimumAbsoluteDifferenceBST();
        MinimumAbsoluteDifferenceBST.BSTNode root = null;
        root = sol.insert(root, 4);
        root = sol.insert(root, 2);
        root = sol.insert(root, 6);
        root = sol.insert(root, 1);
        root = sol.insert(root, 3);

        assertEquals(1, sol.getMinimumAbsoluteDifference(root));
    }

    @Test
    public void testExample2_adjacentValues() {
        // BST: [1,0,48,null,null,12,49] -> minimum diff is 1 (between 48 and 49)
        MinimumAbsoluteDifferenceBST sol = new MinimumAbsoluteDifferenceBST();
        MinimumAbsoluteDifferenceBST.BSTNode root = null;
        root = sol.insert(root, 1);
        root = sol.insert(root, 0);
        root = sol.insert(root, 48);
        root = sol.insert(root, 12);
        root = sol.insert(root, 49);

        assertEquals(1, sol.getMinimumAbsoluteDifference(root));
    }
}
