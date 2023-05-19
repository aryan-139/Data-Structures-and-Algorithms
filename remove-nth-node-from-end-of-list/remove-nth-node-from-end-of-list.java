class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); // Create a dummy node
        dummy.next = head; // Connect the dummy node to the head of the list
        ListNode slow = dummy; // Initialize the slow pointer at the dummy node
        ListNode fast = dummy; // Initialize the fast pointer at the dummy node

        // Move the fast pointer n nodes ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both slow and fast pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node from the end by skipping the next node
        slow.next = slow.next.next;

        return dummy.next; // Return the head of the modified list
    }
}
