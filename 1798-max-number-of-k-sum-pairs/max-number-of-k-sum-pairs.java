// class Solution {
//     public int maxOperations(int[] nums, int k) {
//         Arrays.sort(nums);
//         int low = 0, high = nums.length - 1, minOperations = 0;
        
//         while(low < high){
//             if(nums[low] + nums[high] == k){
//                 low++;
//                 high--;
//                 minOperations++;
//             } 
//             else if(nums[low] + nums[high] > k) high--;
//             else low++;
//         }
        
//         return minOperations;
//     }
// }

class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int res = k - nums[i];
            if(map.containsKey(res)){
                count++;
                if(map.get(res) == 1) map.remove(res);
                else map.put(res, map.get(res) - 1);
            }
            else{
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        return count;
    }
}