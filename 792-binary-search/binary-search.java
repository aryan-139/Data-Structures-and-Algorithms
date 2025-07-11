class Solution {
    public int search(int[] nums, int target) {
        int lo=0, hi=nums.length-1, mid=0; 
        if(nums.length==1 && nums[0]==target)
        return 0; 
        while(lo<=hi){
            mid = lo + (hi - lo) / 2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                lo=mid+1;
            }else if(nums[mid]>target){
                hi=mid-1;
            }
        }
        return -1; 
    }
}