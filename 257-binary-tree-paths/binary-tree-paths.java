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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths= new ArrayList<>();
        if(root!=null){
            p(root, "", paths);
        }
        return paths;
    }
    public void p(TreeNode node, String p, List<String> paths){
        if(node.left==null && node.right==null){
            paths.add(p+node.val);
        } else {
            if(node.left!=null){
                p(node.left, p + node.val + "->", paths);
            }
            if(node.right!=null){
                p(node.right, p + node.val + "->", paths);
            }
        }
    }
}