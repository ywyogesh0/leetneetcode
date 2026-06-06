package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberOfIslandsTest {
    @Test
    public void exampleTest() {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        assertEquals(3, NumberOfIslands.numIslands(grid));
    }
}
