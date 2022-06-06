class Solution {
    public int minimumSum(int num) {
        //formation of num1 and num2
        //one can use the Arrays.sort() here to sort the elements within the array
        int arr[]=new int[4];
        int p=0;
        while(num>0)
        {
            arr[p++]=num%10;
            num/=10;
        }
        Arrays.sort(arr);
        int num1=arr[0]*10+arr[2];
        int num2=arr[1]*10+ arr[3];
        return(num1+num2);
       }
}