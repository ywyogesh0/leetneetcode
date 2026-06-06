package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class RateLimiterTest {
    @Test
    public void exampleTest() throws InterruptedException {
        RateLimiter rl = new RateLimiter(2, 1000);
        assertTrue(rl.allowRequest("u"));
        assertTrue(rl.allowRequest("u"));
        assertFalse(rl.allowRequest("u"));
    }
}
