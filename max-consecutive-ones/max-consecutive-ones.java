class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0, c=0;
        for(int i=0;i<nums.length;i++)
        {
            if (nums[i]==1)
                c++;
            else
            {
                if(c>max)
                    max=c;
                c=0;
            }
        }
        if(c>max)
                    max=c;
                
        return(max);
        
    }
}