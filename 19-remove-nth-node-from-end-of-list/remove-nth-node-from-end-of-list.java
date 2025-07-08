class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode s = dummy;
        ListNode f = dummy;

        for (int i = 0; i <= n; i++) {
            f = f.next;
        }
        while (f != null) {
            s = s.next;
            f = f.next;
        }

        // Remove the target node
        s.next = s.next.next;

        return dummy.next;
    }
}
