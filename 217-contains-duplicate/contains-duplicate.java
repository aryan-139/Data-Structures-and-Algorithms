import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        // No need to check if length < 2, it won't contain duplicates
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {  // Check if consecutive numbers are the same
                return true;
            }
        }
        return false;
    }
}
