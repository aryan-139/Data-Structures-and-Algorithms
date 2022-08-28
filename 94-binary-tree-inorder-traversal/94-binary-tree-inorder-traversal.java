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
        ArrayList <Integer> list= new ArrayList<Integer>();
        traversal(root,list);
        return(list);
    }
    public void traversal(TreeNode root,ArrayList<Integer> l){
        if(root == null)
            return;
        traversal(root.left,l);
        l.add(root.val);
        traversal(root.right,l);
    }
}