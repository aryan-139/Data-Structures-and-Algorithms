class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> c= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(c.contains(nums[i]))
            return true;
            c.add(nums[i]);
        }
        return false;
    }
}