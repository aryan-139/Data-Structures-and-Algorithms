class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double globalMax = Double.NEGATIVE_INFINITY; 
        double localMax = 0; 
        for(int i = 0; i < nums.length; ++i){
            localMax+=nums[i];
            if(i >= k-1){
                globalMax = Math.max(globalMax, localMax/k);
                localMax -= nums[i-k+1]; 
            }
        }
        return globalMax;
    }
}