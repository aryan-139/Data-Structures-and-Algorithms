/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths = new ArrayList<>();
        dfs(root, targetSum, new ArrayList<>(), paths);
        return paths;
    }
    private void dfs(TreeNode node, int remainingSum, List<Integer> currentPath, List<List<Integer>> paths) {
        if(node ==null) return; 
        currentPath.add(node.val);
        if (node.left == null && node.right == null && remainingSum == node.val) {
            paths.add(new ArrayList<>(currentPath));
        }else{
            dfs(node.left, remainingSum - node.val, currentPath, paths);
            dfs(node.right, remainingSum - node.val, currentPath, paths);
        }
        currentPath.remove(currentPath.size() - 1);
    }
}