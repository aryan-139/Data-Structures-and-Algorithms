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
    public ListNode middleNode(ListNode head) {
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            if(curr==null)
                return(head);
            else
                curr=curr.next;
            head=head.next;
        }
        return(head);
    }
}