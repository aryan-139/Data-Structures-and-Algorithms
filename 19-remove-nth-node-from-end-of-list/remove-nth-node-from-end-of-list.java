class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l = 0;
        ListNode t = head;

        while (t != null) {
            l++;
            t = t.next;
        }

        if (l == n) {
            return head.next;
        }

        int rn = l - n;
        t = head;
        for (int i = 1; i < rn; i++) {
            t = t.next;
        }

        if (t.next != null) {
            t.next = t.next.next;
        }

        return head;
    }
}
