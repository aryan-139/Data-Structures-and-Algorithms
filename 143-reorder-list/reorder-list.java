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
    public void reorderList(ListNode head) {
        if(head==null)
        return;
        List<ListNode> t= new ArrayList<>();
        ListNode p=head; int len=0;
        while(p!=null){
            t.add(p);
            p=p.next;
            len++;
        }
        int i=0; int j=len-1;
        while (i < j) {
            t.get(i).next = t.get(j);
            i++;
            if (i >= j) {
                break;
            }
            t.get(j).next = t.get(i);
            j--;
        }

        t.get(i).next = null;
    }
}