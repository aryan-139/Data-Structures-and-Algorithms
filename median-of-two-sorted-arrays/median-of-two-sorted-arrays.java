import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median=0.0;
        int nums[]=new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        Arrays.sort(nums);
        //the array has now been sorted 
        if (nums.length % 2 == 0) {
            median = (double)(nums[nums.length/2-1] + nums[nums.length/2]) / 2;
        } else {
            median = nums[nums.length/2];
        }

        return median;
    }
}