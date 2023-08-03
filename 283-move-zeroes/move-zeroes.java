class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0; // Points to the position to insert non-zero elements
        int right = 0; // Traverses the array to find non-zero elements

        while (right < nums.length) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }

        // Fill the rest of the array with zeroes
        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }
}
