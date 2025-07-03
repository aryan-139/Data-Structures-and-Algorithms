class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> set= new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        solve(set, nums, new ArrayList<>(), 0, used);
        return set;
    }
    private void solve(List<List<Integer>> set, int [] nums, List<Integer> c, int i, boolean[] used){
        if(c.size()==nums.length){
            set.add(new ArrayList<>(c));
            return; 
        }
        for(int j=0; j<nums.length; j++){
            if(used[j]) continue; 
            c.add(nums[j]);
            used[j]=true;
            solve(set, nums, c, j+1, used);
            c.remove(c.size()-1);
            used[j]=false;
        }
    }
}