class Solution {
    public int removeDuplicates(int[] nums) {
        int ind=0; 
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){
                ind++;
                nums[ind]=nums[i];
            }else{
                continue; 
            }
        }
        return ind+1; 
    }
}