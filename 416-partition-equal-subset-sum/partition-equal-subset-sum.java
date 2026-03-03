class Solution {
    public boolean canPartition(int[] nums) {
        //calculate sum of nums 
        //find half of it
        //check if it can be split into 2 subsets where sum is equal to target 
        int sum=0; 
        for(int num: nums) sum+=num; 
        if(sum%2!=0) return false; 
        int target= sum/2; 
        //if even 1 subset is found where target is reached then we say that it can be partitioned 
        boolean dp[]= new boolean[target+1];
        dp[0]=true; //if target is 0 then it will be true
        for(int num: nums){
            for(int i=target; i>=num; i--){
                dp[i]=dp[i]|| dp[i-num];
            }
        }
        return dp[target]; 
    }
}