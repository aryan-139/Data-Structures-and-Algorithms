class Solution {
    public int findNumbers(int[] nums) {
        int c=0, countEven=0;
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]>0)
            {
                c++;
                nums[i]/=10;
            }
            if(c%2==0)
            {
                countEven++;
                c=0;
            }
            else
            {
                c=0;
            }
        }
        return(countEven);
        
    }
}