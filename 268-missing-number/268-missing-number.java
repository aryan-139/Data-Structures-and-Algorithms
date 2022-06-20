class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // if((nums.length==1)&&(nums[0]==0))
        //     return(1);
        // if(nums.length==2)
        //     return(2);
        // for(int i=0;i<nums[nums.length-1];i++){
        //     if(nums[i]!=i)
        //         return(i);
        // }
        // return(-1);
        
        int sum = 0;
        for(int num: nums)
            sum += num;
            
        return (nums.length * (nums.length + 1) )/ 2 - sum;
    

    }
}