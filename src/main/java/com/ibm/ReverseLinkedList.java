package com.ibm;

/**
 * Problem 4: Reverse a Singly Linked List (iterative)
 *
 * Input: head of a singly linked list (`ListNode`).
 * Output: new head of the reversed list.
 * Example: 1->2->3->null -> returns 3->2->1->null
 *
 * Approach: iterate with prev/curr/next pointers and reverse links in-place.
 *
 * Visual Illustration (1->2->3->null):
 * 1) prev=null,curr=1 -> set 1.next=null, prev=1,curr=2
 * 2) set 2.next=1, prev=2,curr=3
 * 3) set 3.next=2, prev=3,curr=null -> return prev (3->2->1)
 */
public class ReverseLinkedList {
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
