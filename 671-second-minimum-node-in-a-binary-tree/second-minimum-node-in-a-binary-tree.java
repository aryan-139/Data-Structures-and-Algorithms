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
    PriorityQueue<Integer> q= new PriorityQueue<>();
    Set<Integer> set = new HashSet<>();
    public int findSecondMinimumValue(TreeNode root) {
        traverseTree(root);
        q.poll();
        if(q.isEmpty())
        return -1;
        return q.poll();
    }
    private void traverseTree(TreeNode root){
        if(root==null) return;
        if(set.add(root.val))
        q.add(root.val);
        traverseTree(root.left);
        traverseTree(root.right); 
    }
}