import java.util.*;

class Solution {
    public int lengthOfLIS(int[] nums) {
        // Create a memoization cache
        int[][] cache = new int[nums.length][nums.length + 1];
        for (int[] row : cache) {
            Arrays.fill(row, -1);
        }
        
        return lisHelper(nums, -1, 0, cache);
    }
    
    private int lisHelper(int[] nums, int prevIndex, int currentIndex, int[][] cache) {
        if (currentIndex == nums.length) {
            return 0; // Reached the end of the array
        }
        
        if (cache[prevIndex + 1][currentIndex] != -1) {
            return cache[prevIndex + 1][currentIndex]; // Return memoized result if available
        }
        
        int taken = 0;
        if (prevIndex == -1 || nums[currentIndex] > nums[prevIndex]) {
            // Include the current element in the LIS
            taken = 1 + lisHelper(nums, currentIndex, currentIndex + 1, cache);
        }
        
        // Exclude the current element from the LIS
        int notTaken = lisHelper(nums, prevIndex, currentIndex + 1, cache);
        
        // Calculate the maximum LIS length at the current index
        int maxLen = Math.max(taken, notTaken);
        
        // Store the result in the cache
        cache[prevIndex + 1][currentIndex] = maxLen;
        
        return maxLen;
    }
}
