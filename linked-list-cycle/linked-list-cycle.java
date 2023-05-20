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
// import java.util.HashSet;

// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         HashSet<ListNode> cycleDetection = new HashSet<>();
//         ListNode curr = head;
//         while (curr != null) {
//             if (cycleDetection.contains(curr)) {
//                 return true;
//             }
//             cycleDetection.add(curr);
//             curr = curr.next;
//         }
//         return false;
//     }
// }

import java.util.HashSet;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
    ListNode fast = head;
    ListNode slow = head;
        
    while(fast.next != null && fast.next.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        if(fast == slow) return true;
    }
    return false;
    }
}
