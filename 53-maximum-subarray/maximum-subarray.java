class Solution {
    public int maxSubArray(int[] nums) {
        return helper(nums, 0, 0, Integer.MIN_VALUE);
    }

    public int helper(int[] nums, int i, int currentSum, int maxSoFar) {
        if (i == nums.length) return maxSoFar;

        currentSum = Math.max(nums[i], currentSum + nums[i]);  // restart or extend
        maxSoFar = Math.max(maxSoFar, currentSum);              // update global max

        return helper(nums, i + 1, currentSum, maxSoFar);
    }
}
