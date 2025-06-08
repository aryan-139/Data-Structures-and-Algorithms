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
    public int maxDepth(TreeNode root) {
       return dfs(root, 1);
    }
    public int dfs(TreeNode n, int depth){
        if(n==null)
        return depth-1;
        int left= dfs(n.left, depth+1);
        int right= dfs(n.right, depth+1);

        return Math.max(left, right);
    }
}