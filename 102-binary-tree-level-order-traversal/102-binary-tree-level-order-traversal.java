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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        List<List<Integer>> list= new ArrayList<List<Integer>>();
        if(root==null) return list;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> sublist=new ArrayList<Integer>();
            int qsize=q.size();
            for(int i=0;i<qsize;i++){
                TreeNode node=q.remove();
                sublist.add(node.val);
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
            list.add(sublist);
        }
        return(list);
    }
}