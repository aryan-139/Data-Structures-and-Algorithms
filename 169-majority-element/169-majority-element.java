class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                    c++;
            }
            if(c>nums.length/2)
                return(nums[i]);
            else
                c=0;
        }
        return(0);
    }
}