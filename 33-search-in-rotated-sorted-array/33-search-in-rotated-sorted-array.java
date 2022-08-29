class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        //applying simple binary search because the value of nums is pre-passed and updated so this becomes a simple question of searching 
        while(left <= right){
            int mid = left + (right - left)/2;
            
            if(nums[mid] == target) return mid;
            
            if(nums[mid] >= nums[left]){
                if(target >= nums[left] && target < nums[mid])right = mid - 1;
                else left = mid + 1;
            } else{
                if(target > nums[mid] && target <= nums[right])left = mid + 1;
                else right = mid - 1;
            }
        }
        
        return -1;
        }
    }
