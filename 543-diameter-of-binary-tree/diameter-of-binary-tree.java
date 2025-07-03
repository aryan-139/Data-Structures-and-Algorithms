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
    private int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxDiameter;
    }
    private int dfs(TreeNode root){
        if(root==null) return 0;
        int left= dfs(root.left);
        int right= dfs(root.right);
        maxDiameter= Math.max(maxDiameter, left+right);
        return 1+ Math.max(left, right);
    }
}