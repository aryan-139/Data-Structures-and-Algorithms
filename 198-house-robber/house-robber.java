class Solution {
    public int rob(int[] nums) {
        int sum=0; 
        int memo[]=new int[nums.length];
        Arrays.fill(memo, -1);
        return robFrom(nums, 0, sum, memo);
    }
    private int robFrom(int [] nums, int i, int sum, int[]memo){
        if(i> nums.length-1) return 0;
        if(memo[i]!=-1) return memo[i];
        //pick 
        int pick= nums[i]+ robFrom(nums, i+2, sum, memo);
        int skip= robFrom(nums, i+1, sum, memo); 
        memo[i]= Math.max(pick, skip);
        return memo[i];
    }
}