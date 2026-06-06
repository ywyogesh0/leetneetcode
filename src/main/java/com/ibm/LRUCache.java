package com.ibm;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem 46: LRU Cache
 *
 * Input: capacity and operations `get(key)` / `put(key,value)`.
 * Output: `get` returns value or -1 if not present; `put` inserts/updates with LRU eviction.
 * Example: capacity=2, put(1,1), put(2,2), get(1)->1, put(3,3) evicts key 2.
 *
 * Approach: hashmap + doubly-linked list for O(1) get/put operations.
 *
 * Visual Illustration (capacity=2):
 * 1) put(1,1) -> cache: [1]
 * 2) put(2,2) -> cache: [2,1] (most recent first)
 * 3) get(1) -> returns 1 and moves key 1 to front -> [1,2]
 * 4) put(3,3) -> evict LRU key 2 -> cache becomes [3,1]
 */
public class LRUCache {
    private static class Node { int key, val; Node prev, next; Node(int k,int v){key=k;val=v;} }
    private final Map<Integer, Node> map;
    private final Node head, tail;
    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity; map = new HashMap<>();
        head = new Node(0,0); tail = new Node(0,0); head.next = tail; tail.prev = head;
    }
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node n = map.get(key); remove(n); insertFront(n); return n.val;
    }
    public void put(int key, int value) {
        if (map.containsKey(key)) remove(map.get(key));
        if (map.size() == capacity) { map.remove(tail.prev.key); remove(tail.prev); }
        Node n = new Node(key, value); map.put(key, n); insertFront(n);
    }
    private void remove(Node n) { n.prev.next = n.next; n.next.prev = n.prev; map.remove(n.key); }
    private void insertFront(Node n) { n.next = head.next; n.prev = head; head.next.prev = n; head.next = n; map.put(n.key, n); }
}
