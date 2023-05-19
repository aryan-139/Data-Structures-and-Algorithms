class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode merged = new ListNode(); // Create a dummy node
        ListNode mergedCurr = merged;

        while (curr1 != null && curr2 != null) {
            if (curr1.val <= curr2.val) {
                mergedCurr.next = curr1;
                curr1 = curr1.next;
            } else {
                mergedCurr.next = curr2;
                curr2 = curr2.next;
            }
            mergedCurr = mergedCurr.next;
        }

        // Append the remaining nodes of either list
        if (curr1 != null) {
            mergedCurr.next = curr1;
        }
        if (curr2 != null) {
            mergedCurr.next = curr2;
        }

        return merged.next; // Return the head of the merged list
    }
}
