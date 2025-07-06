class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int num: nums){
            map.put(num, 1+map.getOrDefault(num, 0));
            if(map.get(num)>(nums.length/2)){
                return num;
            }
        }
        return -1;
    }
}