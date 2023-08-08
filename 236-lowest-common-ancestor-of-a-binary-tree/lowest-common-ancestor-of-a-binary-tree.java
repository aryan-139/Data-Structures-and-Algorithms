/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        
        TreeNode parent = findLowestCommonAncestor(root, p, q);
        return (pFound && qFound) ? parent : null;
    }
    
    private boolean pFound = false;
    private boolean qFound = false;
    
    private TreeNode findLowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        
        TreeNode leftLCA = findLowestCommonAncestor(root.left, p, q);
        TreeNode rightLCA = findLowestCommonAncestor(root.right, p, q);
        
        if (root == p || root == q) {
            if (leftLCA != null || rightLCA != null) {
                pFound = true;
                qFound = true;
                return root;
            } else {
                return root;
            }
        }
        
        if (leftLCA != null && rightLCA != null) {
            pFound = true;
            qFound = true;
            return root;
        }
        
        if (leftLCA != null) {
            return leftLCA;
        }
        
        if (rightLCA != null) {
            return rightLCA;
        }
        
        return null;
    }
}
