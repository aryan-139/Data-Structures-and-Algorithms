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
        int d=0;
        return depth(root, d);
    }
    public int depth(TreeNode root, int d){
        if(root == null) return 0;
        int left= depth(root.left, d);
        int right= depth(root.right, d);
        return 1 + Math.max(left, right);
    }
}