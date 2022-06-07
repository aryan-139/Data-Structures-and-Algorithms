class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int a = 1;
        
        int ans = 1;
       int count = 0;
        for(int i = 0; i<len-1; i+= count){
            count = 1;
            for(int j = i+1; j<len; j++){
                
                if(nums[i] != nums[j]){
                    nums[a] = nums[j];
                    a++;
                    ans++;
                    break;
                }
                else if(nums[i] == nums[j]){
                    count ++;
                }
            }
        }
        return ans;
    }
}