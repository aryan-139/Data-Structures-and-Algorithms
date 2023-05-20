/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
//         while(head2 != null) {
//         ListNode temp = head1;
//         while(temp != null) {
//             //if both nodes are same
//             if(temp == head2) return head2;
//             temp = temp.next;
//         }
//         head2 = head2.next;
//     }
//     //intersection is not present between the lists return null
//     return null;
//     }
// }
//Approach 2

public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
HashSet<ListNode> st=new HashSet<>();
    while(head1 != null) {
       st.add(head1);
       head1 = head1.next;
    }
    while(head2 != null) {
        if(st.contains(head2)) return head2;
        head2 = head2.next;
    }
    return null;
    }
}