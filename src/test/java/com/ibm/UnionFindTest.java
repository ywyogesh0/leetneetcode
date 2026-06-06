package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class UnionFindTest {
    @Test
    public void exampleTest() {
        UnionFind uf = new UnionFind(5);
        uf.union(0,1); uf.union(1,2); uf.union(3,4);
        assertEquals(2, uf.components);
    }
}
