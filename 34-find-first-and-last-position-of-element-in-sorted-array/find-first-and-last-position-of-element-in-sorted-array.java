class Solution {
    public int[] searchRange(int[] nums, int target) {
        int targetRange []=new int[2];
        targetRange[0]=-1;
        targetRange[1]=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
                targetRange[1]=i;
        }
        for(int j=nums.length-1;j>=0;j--)
        {
            if(target==nums[j])
                targetRange[0]=j;
        }
        return(targetRange);
    }
}