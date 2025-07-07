class Solution {
    public int singleNumber(int[] nums) {
        //XOR associativity property kicks in 
        int num=0; 
        for(int i: nums){
            num^=i;
        }
        return num; 
    }
}