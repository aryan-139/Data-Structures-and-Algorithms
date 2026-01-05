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
    //bfs 
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<TreeNode>(); 
        q.add(root); int height=0; 
        if(root==null) return 0;
        while(!q.isEmpty()){
            int qSize=q.size();
            for(int i=0; i<qSize; i++){
                TreeNode curr= q.poll(); 
                System.out.print(curr.val + " ");
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            height++; 
        } 
        return height; 
    }
}