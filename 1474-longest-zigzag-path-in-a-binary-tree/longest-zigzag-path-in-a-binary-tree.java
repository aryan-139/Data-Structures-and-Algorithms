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
    public int maxLen = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null) {
            return 0;
        }
        lengthHelper(root, false, 0);
        lengthHelper(root, true, 0); // Call for both left and right subtrees
        return maxLen;
    }

    private void lengthHelper(TreeNode root, boolean right, int length) {
        if (root == null)
            return;
        maxLen = Math.max(maxLen, length); // Update maxLen if current length is greater
        if (right) {
            lengthHelper(root.left, false, length + 1);
            lengthHelper(root.right, true, 1); // Reset length for the right subtree
        } else {
            lengthHelper(root.right, true, length + 1);
            lengthHelper(root.left, false, 1); // Reset length for the left subtree
        }
    }
}
