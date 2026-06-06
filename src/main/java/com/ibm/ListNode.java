package com.ibm;

/**
 * List node for singly-linked lists used across problems.
 *
 * Description: simple container node with `val` and `next` fields.
 * Usage/Input: used by methods that accept or return linked lists (e.g., `ListNode head`).
 * Output/Example: representation of list [1,2,3] -> new ListNode(1, new ListNode(2, new ListNode(3))).
 * Approach: helper class; methods operate on `ListNode` sequences.
 *
 * Visual Illustration (list [1,2,3]):
 * 1) new ListNode(1) -> node1
 * 2) node1.next = new ListNode(2); node1.next.next = new ListNode(3)
 * 3) traversal prints 1->2->3
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
