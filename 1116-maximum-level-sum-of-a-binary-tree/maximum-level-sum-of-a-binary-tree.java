import java.util.LinkedList;
import java.util.Queue;

class Solution {
    int maxSum = Integer.MIN_VALUE; // Initialize to a very small value
    int maxLevel = 0;

    public int maxLevelSum(TreeNode root) {
        checkMaxSumLeaves(root, 1); // Start from level 1
        return maxLevel;
    }

    private void checkMaxSumLeaves(TreeNode root, int level) {
        Queue<TreeNode> q = new LinkedList<>();
        int localSum = 0;
        
        if (root == null) {
            return;
        }
        
        q.add(root);
        
        while (!q.isEmpty()) {
            int levelSize = q.size(); // Number of nodes at current level
            localSum = 0; // Reset localSum for the current level
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.poll();
                localSum += curr.val;
                
                if (curr.right != null) {
                    q.add(curr.right);
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
            }
            
            if (localSum > maxSum) {
                maxSum = localSum;
                maxLevel = level;
            }
            
            level++; // Move to the next level
        }
    }
}
