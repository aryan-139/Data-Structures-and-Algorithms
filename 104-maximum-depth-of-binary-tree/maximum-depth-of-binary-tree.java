class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0; // Base case: an empty tree has a depth of 0
        }
        int leftDepth = maxDepth(root.left); // Recursively calculate the depth of the left subtree
        int rightDepth = maxDepth(root.right); // Recursively calculate the depth of the right subtree
        int maxChildDepth = Math.max(leftDepth, rightDepth); // Get the maximum depth among the left and right subtrees
        
        return maxChildDepth + 1; // Add 1 to account for the current level
    }
}