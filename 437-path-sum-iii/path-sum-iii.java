class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        return pathSumFrom(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }
    
    public int pathSumFrom(TreeNode root, long targetSum) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        if (root.val == targetSum) {
            res++;
        }
        res += pathSumFrom(root.left, targetSum - root.val);
        res += pathSumFrom(root.right, targetSum - root.val);
        return res;
    }
}