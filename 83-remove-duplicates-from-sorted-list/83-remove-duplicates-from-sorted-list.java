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
//         ListNode unique=head;
//         if(head.next==null)
//             return(head);
//         ListNode curr= head;
        
//         while(curr!=null){
//             curr=curr.next;
//             if(curr==null)
//                 break;
//             if(curr.val==head.val){
//                 continue;
//             }
//             else
//             {
//                 head.next=curr;
//             }
            
//            head=head.next;
//         }
//         return(head);
//     }
// }
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode unique=head;
        // if(head.next==null)
        //     return(head);
        ListNode curr= head;
        
        while(curr!=null){
            if(curr.next==null)
            {
                //to check the duplicates in the last 2 position
                if(curr.val==unique.val)
                {unique.next=null; break;}
                else
                    break;
            }
            curr=curr.next;
            
            if(curr.val==unique.val){
                continue;
            }
            else
            {
                unique.next=curr;
            }
            
           unique=unique.next;
        }
        
        return(head);
    }
}