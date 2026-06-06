package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class LRUCacheTest {
    @Test
    public void exampleTest() {
        LRUCache cache = new LRUCache(2);
        cache.put(1,1); cache.put(2,2);
        assertEquals(1, cache.get(1));
        cache.put(3,3);
        assertEquals(-1, cache.get(2));
    }
}
