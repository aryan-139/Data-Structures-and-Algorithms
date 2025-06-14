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
    public boolean isUnivalTree(TreeNode root) {
        return check(root, root.val);
    }
    public boolean check(TreeNode node, int nodeVal){
        if(node == null) return true;
        if(node.val != nodeVal) return false;
        return check(node.left, nodeVal) && check(node.right, nodeVal);
    }
}