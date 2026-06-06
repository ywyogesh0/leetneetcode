package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class DetectCycleTest {
    @Test
    public void exampleTest() {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b; b.next = c; c.next = b; // cycle
        assertTrue(DetectCycle.hasCycle(a));
    }
}
