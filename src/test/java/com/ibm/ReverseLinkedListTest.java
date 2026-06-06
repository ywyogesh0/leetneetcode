package com.ibm;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseLinkedListTest {
    @Test
    public void exampleTest() {
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        ListNode r = ReverseLinkedList.reverse(n1);
        assertEquals(5, r.val);
        assertEquals(4, r.next.val);
    }
}
