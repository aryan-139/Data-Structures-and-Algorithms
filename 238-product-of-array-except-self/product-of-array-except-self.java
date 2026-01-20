class Solution {
    public int[] productExceptSelf(int[] nums) {
        //calculate prefix product array 
        //calculate postfix product array 
        int [] pre= new int[nums.length];
        int [] post=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            pre[i]=pre[i-1]*nums[i];
        }
        post[nums.length-1]=nums[nums.length-1];
        for(int j=nums.length-2; j>=0; --j){
            post[j]=post[j+1]*nums[j];
        }
        int res[]= new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i==0){
                res[0]=post[i+1];
            }
            else if(i==nums.length-1){
                res[nums.length-1]=pre[nums.length-2];
            }else{
                res[i]=pre[i-1]*post[i+1];
            }
        }
        return res;
    }
}