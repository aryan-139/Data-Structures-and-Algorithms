class Solution {
    public List<List<Integer>> permute(int[] nums) {
        //first here we create the answer list structure in which we have to return the answer 
        List<List<Integer>> ans = new ArrayList<>();
        //we are taking one index, then the original passed array and then the answer data list alongside 
        recurPermute(0, nums, ans);
        return ans;
    }
    //now the intuition is that once we will push the original sequence then swap all along the way 
    private void recurPermute(int index, int[] nums, List<List<Integer>> ans) {
        if (index == nums.length) {
            // copy the ds to ans
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recurPermute(index + 1, nums, ans);
            swap(i, index, nums);
        }
    }
    private void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
