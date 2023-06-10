class Solution {
    private int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0; // Initialize the diameter
        
        calculateDepth(root); // Start the depth calculation
        
        return diameter;
    }
    
    private int calculateDepth(TreeNode node) {
        if (node == null) {
            return 0; // Base case: an empty tree has a depth of 0
        }
        
        int leftDepth = calculateDepth(node.left); // Recursively calculate the depth of the left subtree
        int rightDepth = calculateDepth(node.right); // Recursively calculate the depth of the right subtree
        
        // Update the diameter if the current path has a larger diameter
        diameter = Math.max(diameter, leftDepth + rightDepth);
        
        // Return the depth of the current node's subtree
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
