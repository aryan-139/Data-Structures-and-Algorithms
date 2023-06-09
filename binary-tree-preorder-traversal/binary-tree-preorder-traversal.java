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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        preorderUtil(root, ans);
        return ans;
    }
    private void preorderUtil(TreeNode curr, ArrayList<Integer> ans){
        if(curr==null)
        return;
        ans.add(curr.val);
        preorderUtil(curr.left, ans);
        preorderUtil(curr.right, ans);
    }
}