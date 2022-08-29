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
        ArrayList<Integer> list=new ArrayList<Integer>();
        preorder(root,list);
        return(list);
    }
    public void preorder(TreeNode root, ArrayList l){
        if(root==null)
            return;
        l.add(root.val);
        if(root.left!=null)
            preorder(root.left,l);
        if(root.right!=null)
            preorder(root.right,l);
    }
}