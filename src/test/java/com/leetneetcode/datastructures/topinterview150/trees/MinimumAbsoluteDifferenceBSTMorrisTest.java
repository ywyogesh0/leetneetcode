package com.leetneetcode.datastructures.topinterview150.trees;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumAbsoluteDifferenceBSTMorrisTest {

    @Test
    public void testExample1_smallTree() {
        MinimumAbsoluteDifferenceBST sol = new MinimumAbsoluteDifferenceBST();
        MinimumAbsoluteDifferenceBST.BSTNode root = null;
        root = sol.insert(root, 4);
        root = sol.insert(root, 2);
        root = sol.insert(root, 6);
        root = sol.insert(root, 1);
        root = sol.insert(root, 3);

        assertEquals(1, sol.getMinimumAbsoluteDifferenceMorris(root));
    }

    @Test
    public void testExample2_adjacentValues() {
        MinimumAbsoluteDifferenceBST sol = new MinimumAbsoluteDifferenceBST();
        MinimumAbsoluteDifferenceBST.BSTNode root = null;
        root = sol.insert(root, 1);
        root = sol.insert(root, 0);
        root = sol.insert(root, 48);
        root = sol.insert(root, 12);
        root = sol.insert(root, 49);

        assertEquals(1, sol.getMinimumAbsoluteDifferenceMorris(root));
    }
}
