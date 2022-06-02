class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if (i==j)
                    continue;
                if(arr[j]==2*arr[i])
                    return(true);
            }
        }
        return(false);
    }
}