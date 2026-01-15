class Solution {
    //whichever side has a greater element-> i will tend towards that side
    public int findPeakElement(int[] nums) {
        int lo=0; 
        int high=nums.length-1;
        int len=nums.length;
        //boundaries either sides are -infinity 
        if(len==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[len-2]< nums[len-1]) return len-1; 
        while(lo<high){
            int mid=(lo+high)/2;
            System.out.println(lo+" "+mid+" "+high);
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid; 
            else if(nums[mid+1]> nums[mid]) lo=mid+1;
            else{
                high=mid;
            }
        }
        return -1;
        
    }
}