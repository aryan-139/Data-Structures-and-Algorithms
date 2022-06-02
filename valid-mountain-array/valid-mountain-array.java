class Solution {
    public boolean validMountainArray(int[] arr) {
        int max=0, pos=-1;
        if(arr.length<3)
            return(false);
        if(arr[arr.length-1]>arr[arr.length-2])
            return(false);
        for(int k=0;k<arr.length;k++)
        {
            if(arr[k]>max)
            {
                max=arr[k];
                pos=k;
            }
        }
        if(pos==0)
            return(false);
        for(int i=0;i<arr.length-1;i++)
        {
            if(i<pos)
            {
                if(arr[i]<arr[i+1])
                    continue;
                else
                    return(false);
            }
            else
            {
                if(arr[i]>arr[i+1])
                    continue;
                else
                    return(false);
            }
        }
        return(true);
    }
}