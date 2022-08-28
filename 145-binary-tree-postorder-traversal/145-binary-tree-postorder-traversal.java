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
        ArrayList<Integer> list= new ArrayList<Integer>();
        postorder(root,list);
        return(list);
    }
    public void postorder(TreeNode root, ArrayList arr){
        if(root==null)
            return;
        if(root.left!=null)
            postorder(root.left,arr);
        if(root.right!=null)
            postorder(root.right,arr);
        arr.add(root.val);
    }
}