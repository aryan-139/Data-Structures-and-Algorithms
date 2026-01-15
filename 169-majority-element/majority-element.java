class Solution {
    //we can use hashing someway
    public int majorityElement(int[] nums) {
        //hashmap with <key, count> 
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0) +1 );
        }
        //traverse hashmap return key where count > n/2
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey(); 
            }
        }
        return -1;
    }
}