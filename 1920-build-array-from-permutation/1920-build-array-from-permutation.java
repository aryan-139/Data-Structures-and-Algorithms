class Solution {
    public int[] buildArray(int[] nums) {
        int ans[]=new int[nums.length];
        //to add extra variables to the final array
        for(int i=0;i<nums.length;i++)
        {
            ans[i] = nums[nums[i]];
        }
        return(ans);
    }
}