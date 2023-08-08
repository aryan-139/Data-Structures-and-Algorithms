import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    List<Integer> ans = new ArrayList<>();
    
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null)
            return ans;
        rightViewHelper(root);
        return ans;
    }
    
    private void rightViewHelper(TreeNode root) {
        if (root == null)
            return;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty()) {
            int levelSize = q.size();
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();
                
                if (i == levelSize - 1) { // If it's the last node in this level, add to answer
                    ans.add(node.val);
                }
                
                if (node.left != null) {
                    q.add(node.left);
                }
                
                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }
    }
}
