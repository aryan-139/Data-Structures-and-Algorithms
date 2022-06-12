class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int j=0;j<nums.length;j++)
            nums[j]=nums[j]*nums[j];
        //squares are stored 
        int temp=0;
        //applying bubble sort
        for(int i=0;i<nums.length-1;i++)
        {
            for(int k=i+1;k<nums.length;k++)
            {
                if(nums[k]<nums[i])
                {
                    temp=nums[i];
                    nums[i]=nums[k];
                    nums[k]=temp;
                }
            }
        }
        return(nums);
        
    }
}