package com.ibm;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem 33: Trie (Prefix Tree)
 *
 * Input: words / queries as strings.
 * Output: support for insert/search/startsWith boolean results.
 * Example: insert("apple"), search("apple") -> true, startsWith("app") -> true
 *
 * Approach: standard prefix tree using nested maps (TrieNode children), O(L) per operation where L is length.
 *
 * Visual Illustration (insert "app", search "app"):
 * 1) insert: root -> 'a' node -> 'p' node -> 'p' node (mark isEnd)
 * 2) search("app"): traverse a->p->p and check isEnd==true -> found
 */
public class Trie {
    private final TrieNode root = new TrieNode();
    public void insert(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            curr.children.putIfAbsent(c, new TrieNode());
            curr = curr.children.get(c);
        }
        curr.isEnd = true;
    }
    public boolean search(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            if (!curr.children.containsKey(c)) return false;
            curr = curr.children.get(c);
        }
        return curr.isEnd;
    }
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for (char c : prefix.toCharArray()) {
            if (!curr.children.containsKey(c)) return false;
            curr = curr.children.get(c);
        }
        return true;
    }
}
class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEnd = false;
}
