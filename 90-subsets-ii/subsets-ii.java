class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> set = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(set, nums, new ArrayList<>(), 0);
        return set;
    }

    private void backtrack(List<List<Integer>> set, int[] nums, List<Integer> current, int index) {
        set.add(new ArrayList<>(current)); 

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            current.add(nums[i]);
            backtrack(set, nums, current, i + 1);
            current.remove(current.size() - 1); 
        }
    }
}
