class Solution {
    public int rob(int[] nums) {
        int memo[] = new int[nums.length];
        Arrays.fill(memo, -1);
        return s(nums, 0, memo);
    }

    public int s(int[] nums, int i, int[] memo) {
        if (nums.length == 1)
            return nums[i];
        if (i >= nums.length)
            return 0;

        if (memo[i] != (-1))
            return memo[i];

        memo[i] = Math.max(s(nums, i + 1, memo), nums[i] + s(nums, i + 2, memo));
        return memo[i];
    }
}