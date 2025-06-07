class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        gVar(l, new ArrayList<>(), nums, 0);
        return l;
    }

    public void gVar(List<List<Integer>> res, List<Integer> current, int[] nums, int i) {
        if (i == nums.length) {
            res.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[i]);
        gVar(res, current, nums, i + 1);

        current.remove(current.size() - 1);
        gVar(res, current, nums, i + 1);
    }
}
