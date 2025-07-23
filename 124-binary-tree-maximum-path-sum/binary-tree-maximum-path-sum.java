class Solution {
    private int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }
    private int dfs(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(dfs(node.left), 0);
        int right = Math.max(dfs(node.right), 0);
        int currentMax = left + right + node.val;
        maxSum = Math.max(maxSum, currentMax);
        return Math.max(left, right) + node.val;
    }
}
