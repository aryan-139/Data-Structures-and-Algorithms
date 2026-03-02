class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int tempMax = maxProd;
            maxProd = Math.max(curr,
                        Math.max(maxProd * curr, minProd * curr));
            minProd = Math.min(curr,
                        Math.min(tempMax * curr, minProd * curr));
            res = Math.max(res, maxProd);
        }
        return res;
    }
}