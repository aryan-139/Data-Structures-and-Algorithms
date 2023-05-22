class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        //handling all the edge cases 

        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        //if there are nx rotations then handle that edge case 
        k = k % length;
        if (k == 0) {
            return head;
        }
        //now only when all the edge cases are tackled should we do something completely new
        //that is rotate the linked list 
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        //move the fast pointer ahead appropriately
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //just traverse till we get fast as null 

        ListNode newHead = slow.next;
        slow.next = null;
        tail.next = head;
        //just modifying the break and addition points 
        return newHead;
    }
}
