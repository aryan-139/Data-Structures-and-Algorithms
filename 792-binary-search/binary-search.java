class Solution {
    public int search(int[] nums, int target) {
        int lo=0, hi=nums.length-1, mid=0; 
        if(nums.length==1 && nums[0]==target)
        return 0; 
        while(lo<=hi){
            mid = lo + (hi - lo) / 2;
            System.out.println("mid"+mid);
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                lo=mid+1;
                System.out.println("lo"+lo);
            }else if(nums[mid]>target){
                hi=mid-1;
                System.out.println("hi"+hi);
            }
        }
        return -1; 
    }
}