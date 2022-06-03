class Solution {
    public int dominantIndex(int[] nums) {
        //find largest
        int max=0,pos=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]>max)
            {max=nums[j];pos=j;}
        }
    
       for(int i=0;i<nums.length;i++)
        {
            if(i==pos)
                continue;
            if(nums[i]*2>max)
                return(-1);
        }
        return(pos);
        
    }
}