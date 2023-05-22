public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode curr = head;
        int pos = 1;
        while (curr != null) {
            if (map.containsKey(curr)) {
                return curr;  // Return the node where the cycle starts
            } else {
                map.put(curr, pos);
                pos++;
                curr = curr.next;
            }
        }
        // No cycle detected, return null or any appropriate value
        return null;
    }
}
