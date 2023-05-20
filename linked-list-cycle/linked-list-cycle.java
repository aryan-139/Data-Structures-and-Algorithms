import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.HashSet;

public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> cycleDetection = new HashSet<>();
        ListNode curr = head;
        while (curr != null) {
            if (cycleDetection.contains(curr)) {
                return true;
            }
            cycleDetection.add(curr);
            curr = curr.next;
        }
        return false;
    }
}
