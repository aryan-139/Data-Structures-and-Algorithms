class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums); int max=nums[nums.length-1], c=1;
        if(nums.length<3){
            return(nums[nums.length-1]);
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<max){
                c++; max=nums[i];
            }
            if(c==3)
                break;
            if((c<3)&&(i==0))
                return(nums[nums.length-1]);
        }
        return(max);
    }
}