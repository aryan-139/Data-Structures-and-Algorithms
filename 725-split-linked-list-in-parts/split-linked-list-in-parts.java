class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        //intuition is that length/k 
        //except the first list all others will be equal and the first will be n/k + n%k
        
        // Step 1: Find the total length of the list
        int totalLength = 0;
        ListNode curr = head;
        while (curr != null) {
            totalLength++;
            curr = curr.next;
        }

        // Step 2: Calculate base size and extra nodes
        int partSize = totalLength / k;
        int extra = totalLength % k;

        // Step 3: Split the list
        curr = head;
        for (int i = 0; i < k; i++) {
            result[i] = curr;  // head of this part
            int currentPartSize = partSize + (i < extra ? 1 : 0);

            // Move to the end of the current part
            for (int j = 0; j < currentPartSize - 1; j++) {
                if (curr != null) curr = curr.next;
            }

            // Break the list and move to the next part
            if (curr != null) {
                ListNode next = curr.next;
                curr.next = null;  // break link
                curr = next;
            }
        }

        return result;
    }
}
