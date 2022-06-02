class Solution {
    public void duplicateZeros(int[] arr) {
        //check zero
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                //shift the array to right
            for(int j = arr.length - 1; j > i; j--) {
                arr[j] = arr[j - 1];
                }
                i++;
                //this is necessary because if not then it will keep checking the current value and make the entire array equal to a bunch of zeroes 
            }
            
        }
        
    }
}