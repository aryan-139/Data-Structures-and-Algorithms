class Solution {
    public int heightChecker(int[] heights) {
        int expected[]=new int[heights.length];
        int temp,c=0;
        //store the values in different array
        for(int p=0;p<heights.length;p++)
            expected[p]=heights[p];
        for(int i=0;i<heights.length-1;i++)
        {
            for(int j=i+1;j<heights.length;j++)
            {
                if(heights[j]<heights[i])
                {
                    temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;
                }
            }
        }
        for(int k=0;k<heights.length;k++)
        {
            if(heights[k]!=expected[k])
                c++;
        }
        return(c);
    }
}