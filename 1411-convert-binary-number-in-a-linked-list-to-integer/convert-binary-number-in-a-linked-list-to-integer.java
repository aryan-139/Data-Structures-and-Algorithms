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
    public int getDecimalValue(ListNode head) {
        head= reverse(head);
        int val=0; int i=0;
        while(head!=null){
            if(head.val==1)
            val+= Math.pow(2, i);
            head=head.next; 
            i++;
        }
        return val; 
    }
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next; // Save next
            head.next = prev;              // Reverse pointer
            prev = head;                   // Move prev
            head = nextNode;               // Move head
        }
        return prev; // New head
    }
}