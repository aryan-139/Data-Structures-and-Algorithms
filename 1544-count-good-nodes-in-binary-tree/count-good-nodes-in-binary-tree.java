
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
    int count=0;
    public int goodNodes(TreeNode root) {
        TreeNode currVal=root;
        TreeNode rootCopy=root;
        dfsUtil(root,currVal,rootCopy);
          System.out.println(count);
        return count;
    }
    private void dfsUtil(TreeNode root, TreeNode currVal, TreeNode rootCopy){
        if(root==null)
        return;
        if(root.val >=currVal.val){
            count++;
            currVal=root;
        }
      
        dfsUtil(root.left, currVal, rootCopy);
        dfsUtil(root.right, currVal, rootCopy);
        // currVal=rootCopy;
    }
}