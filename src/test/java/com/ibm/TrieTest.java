package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrieTest {
    @Test
    public void exampleTest() {
        Trie trie = new Trie();
        trie.insert("apple");
        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
        assertTrue(trie.startsWith("app"));
    }
}
