class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n+n];
        for(int i=0;i<n;i++)
        {
            arr[i]=nums[i];
        }
        int j=0;
        for(int i=n;i<n+n;i++)
        {
            arr[i]=nums[j];
            j++;
        }
        return arr;
    }
}