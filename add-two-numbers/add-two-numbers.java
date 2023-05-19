class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Create a dummy node to simplify list creation
        ListNode curr = dummy; // Initialize a current pointer to the dummy node
        int carry = 0; // Initialize the carry value to 0

        // Iterate until either l1 or l2 reaches null or if both reach null but there is still a carry value
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0; // Initialize the sum for each iteration

            if (l1 != null) { // Add the value of l1 to the sum and move to the next node in l1
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) { // Add the value of l2 to the sum and move to the next node in l2
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry; // Add the carry value to the sum

            carry = sum / 10; // Update the carry by dividing the sum by 10 to get the carry value

            ListNode node = new ListNode(sum % 10); // Create a new node with the value obtained by moduloing the sum by 10
            curr.next = node; // Connect the new node to the current node
            curr = curr.next; // Move the current pointer to the newly added node
        }

        return dummy.next; // Return the list starting from the node after the dummy node
    }
}
