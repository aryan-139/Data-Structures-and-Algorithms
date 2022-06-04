class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int finalArr[]=new int[nums.length];
        int p=0,k=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {finalArr[p]=nums[i];p++;}
            else
            {
                finalArr[k]=nums[i];k--;
            }
        }
        return(finalArr);
    }
}