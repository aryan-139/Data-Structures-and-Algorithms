class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> set= new ArrayList<>();
        solve(set, nums, new ArrayList<>(), 0);
        return set; 
    }
    private void solve(List<List<Integer>> set, int nums[], List<Integer> c, int i){
        if(i>=nums.length){
            set.add(new ArrayList<>(c));  
            return; 
        }
        c.add(nums[i]);
        solve(set, nums, c, i+1);        
        c.remove(c.size()-1);
        solve(set, nums, c, i+1);   
    }
}