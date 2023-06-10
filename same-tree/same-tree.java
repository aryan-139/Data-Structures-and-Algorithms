class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null, return true
        if (p == null && q == null) {
            return true;
        }
        // If one node is null and the other is not, return false
        if (p == null || q == null) {
            return false;
        }
        // Compare the values of the nodes
        if (p.val != q.val) {
            return false;
        }
        // Compare the left and right children of the nodes
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}