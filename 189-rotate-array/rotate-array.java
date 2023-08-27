import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        //method 1: Using a Simple Array 

        // int n = nums.length;
        // k = k % n; // Handle cases where k is greater than n
        
        // if (n > 1) {
        //     int[] temp = new int[k];
            
        //     // Store the last k elements in temp
        //     for (int i = n - k, j = 0; i < n; i++, j++) {
        //         temp[j] = nums[i];
        //     }
            
        //     // Shift the remaining elements to the right
        //     for (int i = n - k - 1; i >= 0; i--) {
        //         nums[i + k] = nums[i];
        //     }
            
        //     // Copy back the temp part to the beginning
        //     for (int i = 0; i < k; i++) {
        //         nums[i] = temp[i];
        //     }
        // }
        
        // System.out.print(Arrays.toString(nums));

        //method 2
        int n = nums.length;
        k = k % n; // Handle cases where k is greater than n
        
        reverse(nums, 0, n - 1); // Reverse the entire array
        reverse(nums, 0, k - 1); // Reverse the first k elements
        reverse(nums, k, n - 1); // Reverse the remaining elements
        
        System.out.print(Arrays.toString(nums));
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    


        
        
    }
}
