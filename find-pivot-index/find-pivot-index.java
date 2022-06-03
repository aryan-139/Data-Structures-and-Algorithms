class Solution {
    public int pivotIndex(int[] nums) {
        
        int pivot=0, sumLeft=0,sumRight=0;
        for(int i=0;i<nums.length;i++)
        {
            pivot=i;
            //adding the left elements
            for(int j=0;j<i;j++)
            {
                sumLeft+=nums[j];
            }
            //adding the right ones
            for(int k=i+1;k<nums.length;k++)
            {
                sumRight+=nums[k];
            }
            if(sumLeft==sumRight)
                return(i);
            else
            {
                sumLeft=0;
                sumRight=0;
            }
            
            
        }
        return(-1);
    }
}