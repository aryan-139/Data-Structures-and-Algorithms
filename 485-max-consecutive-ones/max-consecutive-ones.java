class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0, max = 0;
        for (int num : nums) {
            if (num == 1) {
                c++; 
                max = Math.max(c, max);
            } else
                c = 0;
        }
        return max;
    }
}