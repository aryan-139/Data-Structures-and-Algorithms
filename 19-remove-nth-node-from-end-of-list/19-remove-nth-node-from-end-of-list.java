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
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode slow= head;
//         ListNode fast=head;
//         ListNode curr=head; int c=0;
//         while(curr.next!=null){
//             c++;
//             curr=curr.next;
//         }
//         System.out.print(c);
//         for(int i=0;i<n;i++)
//             fast=fast.next;
//         if((head.next==null)&&(n==1))
//             return(null);
//         // //edge case when there are 2 nodes in the Linked List 
//         // if((fast.next==null)&&(c==1)){
//         //         slow.next=null;
//         //         return(head);
//         //     }
//         while(fast.next!=null){
//             slow=slow.next;
//             fast=fast.next;
            
//             if(fast.next==null){
//                 System.out.print(slow.val);
//             slow.next=slow.next.next;}
//         }
        
//         return(head);
        
//     }
// }
class Solution{
    public ListNode removeNthFromEnd(ListNode head, int n) {
    
    ListNode start = new ListNode(0);
    ListNode slow = start, fast = start;
    slow.next = head;
    
    //Move fast in front so that the gap between slow and fast becomes n
    for(int i=1; i<=n+1; i++)   {
        fast = fast.next;
    }
    //Move fast to the end, maintaining the gap
    while(fast != null) {
        slow = slow.next;
        fast = fast.next;
    }
    //Skip the desired node
    slow.next = slow.next.next;
    return start.next;
}
}