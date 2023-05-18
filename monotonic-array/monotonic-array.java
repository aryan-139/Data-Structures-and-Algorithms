class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length <= 1)
            return true;

        boolean increasing = nums[0] <= nums[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i++) {
            if (increasing) {
                if (nums[i] > nums[i + 1])
                    return false;
            } else {
                if (nums[i] < nums[i + 1])
                    return false;
            }
        }

        return true;
    }
}
