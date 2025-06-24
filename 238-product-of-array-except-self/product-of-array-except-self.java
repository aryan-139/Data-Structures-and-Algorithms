class Solution {
    public int[] productExceptSelf(int[] nums) {
        int suffix[]= new int[nums.length];
        Arrays.fill(suffix, 1); int prod=1;
        //populate suffix
        for(int i=nums.length-1; i>=0; i--){
            prod*=nums[i];
            suffix[i]=prod;
        }
        int prefix=1;
        int arr[]=new int[nums.length];
        for(int j=0; j<nums.length-1;j++){
            arr[j]=prefix*suffix[j+1];
            prefix*=nums[j];
            System.out.println(arr[j]);
            
        }
        arr[nums.length-1]=prefix;
        System.out.print(Arrays.toString(suffix));
        return arr;
    }
}