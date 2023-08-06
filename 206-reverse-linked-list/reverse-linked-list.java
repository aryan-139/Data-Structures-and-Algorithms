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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode temp = null;
        ListNode prev = null;
        
        while (curr != null) {
            temp = curr.next; // Store the next node
            curr.next = prev; // Reverse the link
            prev = curr; // Move prev pointer
            curr = temp; // Move curr pointer
        }
        
        return prev; // Return the new head of the reversed list
    }
}
