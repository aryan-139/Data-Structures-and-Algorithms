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
        ListNode curr=head;
         int length=0;
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        int i=0;
        int arr[]=new int[length];
        while(head!=null){
            length++;
            arr[i]=head.val;
            i++;
            head=head.next;
            //curr=curr.next;
            
        }
        int sum=0;
        for(int j=arr.length-1;j>=0;j--){
            sum+=Math.pow(2,arr.length-1-j)*arr[j];
        }
        return(sum);
        
    }
}