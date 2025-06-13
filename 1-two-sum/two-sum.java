class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int l[]=new int[2];
        for(int i=0; i< nums.length; i++){
            if(map.containsKey(target-nums[i])){
                l[0]=i;
                l[1] = map.get(target-nums[i]);
                return l;
            }
            map.put(nums[i], i);
        }
        return l;
    }
}