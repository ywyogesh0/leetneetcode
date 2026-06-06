package com.ibm;

import java.util.*;

/**
     * Problem 41: Rate Limiter (sliding window)
     *
     * Input: stream of timestamps (or request events) and a rate limit `N` per time window.
     * Output: boolean allowing or rejecting requests based on recent counts.
     * Example: allow up to 5 requests per minute.
     *
     * Approach: sliding window using deque or timestamp buckets to count recent events.
     *
     * Visual Illustration (allow 2 requests per 10s):
     * 1) request at t=0 -> allowed, window=[0]
     * 2) request at t=3 -> allowed, window=[0,3]
     * 3) request at t=5 -> rejected (window size==2), after t>=10 the earliest expires
 */
public class RateLimiter {
    private final int maxRequests;
    private final long windowMs;
    private final Map<String, Deque<Long>> userWindows = new HashMap<>();

    public RateLimiter(int maxRequests, long windowMs) {
        this.maxRequests = maxRequests; this.windowMs = windowMs;
    }
    public synchronized boolean allowRequest(String userId) {
        long now = System.currentTimeMillis();
        userWindows.putIfAbsent(userId, new ArrayDeque<>());
        Deque<Long> window = userWindows.get(userId);
        while (!window.isEmpty() && now - window.peekFirst() >= windowMs) window.pollFirst();
        if (window.size() < maxRequests) { window.addLast(now); return true; }
        return false;
    }
}
