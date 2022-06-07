class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0, j=nums.length-1,m=0;
        while(i<=j)
        {
            m=i+(j-i)/2;
            if(nums[m]==target)
                return(m);
            else if(target<nums[m])
                j=m-1;
            else if(target>nums[m])
                i=m+1;
        }
        if(target>nums[m])
        return(m+1);
        else
            return(m);
    }
}