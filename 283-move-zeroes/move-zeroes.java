class Solution {
    public void moveZeroes(int[] nums) {
        int left=0; int right=0;
        for(int i=0;i<nums.length;i++){
            left=nums[i];
            if(left==0){
                for(int j=i;j<nums.length;j++){
                    if(nums[j]!=0){
                        nums[i]=nums[j];
                        nums[j]=0;
                        break;
                    }
                }
                
            }
        }
    }
}