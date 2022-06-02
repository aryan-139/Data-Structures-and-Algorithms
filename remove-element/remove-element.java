class Solution {
    public int removeElement(int[] nums, int val) {
        int expectedNums[]=new int[99999];
        //make another array to stage the elements in it 
        int p=0;
        //counter to add the nums to the new array 
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                expectedNums[p]=nums[i];
                p++;
            } 
        }
        int t=0;
        for(int j=0;j<p;j++)
        {
            for(int k=j;k<j-1;k++)
            {
                if(expectedNums[j]<=expectedNums[k])
                {
                    t=expectedNums[j];
                    expectedNums[j]=expectedNums[k];
                    expectedNums[k]=t;
                }
            }
        }
        for(int m=0;m<p;m++)
        {
            nums[m]=expectedNums[m];
        }
        return(p);
    }
}