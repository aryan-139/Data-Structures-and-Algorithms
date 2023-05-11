// import javax.lang.model.util.ElementScanner14;

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int k = 0;
//         boolean flag = false;
        
//         // Default case
//         if (nums.length <= 1) {
//             return nums.length;
//         }
    
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i-1]) {
//                 if (!flag) {
//                     flag = true;
//                     k++;
//                 }
//             } else {
//                 if (flag) {
//                     shift(nums, i);
//                     flag = false;
//                 }
//                 k++;
//             }
//         }
//         if (flag) {
//             shift(nums, nums.length);
//         }
//         return k;
//     }
    
//     private void shift(int arr[], int i) {
//         int temp = 0;
//         for (int j = i; j < arr.length - 1; j++) {
//             temp = arr[j];
//             arr[j] = arr[j+1];
//             arr[j+1] = temp;
//         }
//     }
// }

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // index for the first occurrence of a number
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                // If the current number is not a duplicate or is a duplicate that hasn't occurred twice yet
                nums[i++] = n;
            }
        }
        return i; // i represents the length of the new array without duplicates
    }
}
