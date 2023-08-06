/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // List is empty or has only one node, no middle node to delete
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Move slow and fast pointers to find the middle node
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        // Delete the middle node
        prev.next = slow.next;

        return head;
    }
}
