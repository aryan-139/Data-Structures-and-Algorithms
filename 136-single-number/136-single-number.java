class Solution {
    public int singleNumber(int[] nums) {
        int count=0;
        //to find the integher in the array 
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                    count++;
            }
            if(count==1)
                return(nums[i]);
            else
            {count=0;}
        }
        return(0);
    }
}