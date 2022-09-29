class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int min=99999999;
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])<=Math.abs(min))
                min=nums[i];
        }
        return(min);
    }
}