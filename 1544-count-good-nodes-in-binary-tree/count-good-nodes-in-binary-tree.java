class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    public int dfs(TreeNode root, int pathHighest) {
        if (root == null) return 0;
        int good = 0;
        if (root.val >= pathHighest) good = 1;
        int newPathHighest = Math.max(pathHighest, root.val);
        return good + dfs(root.left, newPathHighest) + dfs(root.right, newPathHighest);
    }
}