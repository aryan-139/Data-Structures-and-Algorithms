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
        //it is not just about values, but think in subtrees
        if(root==null) return true; 
        if(!isValidBST(root.left)) return false;
        if(prev!=null && prev.val>=root.val) return false;
        prev=root;  
        //every node on root.right 
        return isValidBST(root.right); 
    }
}