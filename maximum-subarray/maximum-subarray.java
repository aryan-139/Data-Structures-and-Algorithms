class Solution {
    public int maxSubArray(int[] nums) {
        return maxSubArrayHelper(nums, 0, nums.length - 1);
    }

    private int maxSubArrayHelper(int[] nums, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return 0; // Empty subarray
        }

        if (startIndex == endIndex) {
            return nums[startIndex]; // Single element subarray
        }

        int midIndex = (startIndex + endIndex) / 2;

        // Find maximum subarray sum for the left half
        int leftSum = maxSubArrayHelper(nums, startIndex, midIndex);

        // Find maximum subarray sum for the right half
        int rightSum = maxSubArrayHelper(nums, midIndex + 1, endIndex);

        // Find maximum sum subarray that crosses the midpoint
        int crossSum = findCrossSum(nums, startIndex, midIndex, endIndex);

        // Return the maximum among the three sums
        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }

    private int findCrossSum(int[] nums, int startIndex, int midIndex, int endIndex) {
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int sum = 0;

        // Calculate the maximum sum of the left half of the array
        for (int i = midIndex; i >= startIndex; i--) {
            sum += nums[i];
            leftSum = Math.max(leftSum, sum);
        }

        sum = 0;

        // Calculate the maximum sum of the right half of the array
        for (int i = midIndex + 1; i <= endIndex; i++) {
            sum += nums[i];
            rightSum = Math.max(rightSum, sum);
        }

        // Return the sum of the left half, right half, and their combined sum
        return leftSum + rightSum;
    }
}
