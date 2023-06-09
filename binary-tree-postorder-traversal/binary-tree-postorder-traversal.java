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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        postorderUtil(root, ans);
        return ans;
    }
    private void postorderUtil(TreeNode curr, ArrayList<Integer> ans){
        if(curr==null)
        return;
        postorderUtil(curr.left, ans);
        postorderUtil(curr.right, ans);
        ans.add(curr.val);
    }
}