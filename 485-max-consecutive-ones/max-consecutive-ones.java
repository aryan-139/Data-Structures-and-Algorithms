class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0; int max_count=Integer.MIN_VALUE;
        for(int num: nums){
            if(num==1){
                count=count+1;
            }else{
                System.out.println(max_count);
                max_count=Math.max(max_count, count);
                count=0;
            }   
        }
        return Math.max(max_count, count);
    }
}