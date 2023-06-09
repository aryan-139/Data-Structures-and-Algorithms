import java.util.ArrayList;

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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        inorderUtil(root,ans);
        return ans;
    }
    private void inorderUtil(TreeNode root, ArrayList<Integer> ans){
        if(root==null)
        return;
        inorderUtil(root.left, ans);
        ans.add(root.val);
        inorderUtil(root.right, ans);
    }
}