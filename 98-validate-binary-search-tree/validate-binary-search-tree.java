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
    TreeNode prev;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true; 
        //operate on left 
        if(!isValidBST(root.left)) return false;
        //operate on root
        if(prev!=null && prev.val>=root.val) return false;
        prev=root;  
        //operate on right 
        return isValidBST(root.right); 
    }
}