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
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode prev=null;
//         ListNode curr=head;
//         while(curr!=null){
//             if(curr.next==null)
//                 break;
//             if(curr.next.val==curr.val){
//                 //to deal with edge case curr.next.next == null
//                 if(curr.next.next==null)
//                     break;
//                 prev.next=curr.next.next;
//                 curr=curr.next.next;
//             }
//             else
//             {
//                 prev=curr;
//                 curr=curr.next;
//             }
//         }
//         return(head);
//     }
// }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode focusNode = dummy;
    while (focusNode.next != null && focusNode.next.next != null) {
        ListNode slow = focusNode.next;
        ListNode fast = focusNode.next.next;
        if (slow.val != fast.val) {
            focusNode = focusNode.next;
        } else {
            int val = slow.val;
            while (slow != null && val == slow.val) {
                slow = slow.next;
            }
            focusNode.next = slow;
        }
    }
    return dummy.next;
}
}