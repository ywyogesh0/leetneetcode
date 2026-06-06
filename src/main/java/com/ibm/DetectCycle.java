package com.ibm;

/**
 * Problem 5: Detect Cycle in Linked List (Floyd's Tortoise and Hare)
 *
 * Input: head of a singly linked list (`ListNode`).
 * Output: boolean indicating whether the list contains a cycle.
 * Example: 1->2->3->2 (cycle) -> returns true
 *
 * Approach: advance slow by 1 and fast by 2; if they meet a cycle exists.
 *
 * Visual Illustration (list: 3->2->0->-4 with cycle back to node 1):
 * 1) slow moves 1 step, fast moves 2 steps until they meet inside the cycle
 * 2) reset one pointer to head, then move both one step each; the meeting point is cycle entry
 */
public class DetectCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
