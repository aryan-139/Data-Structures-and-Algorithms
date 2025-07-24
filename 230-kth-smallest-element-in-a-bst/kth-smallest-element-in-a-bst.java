class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int leftCount = countNodes(root.left);
        if (k <= leftCount) {
            return kthSmallest(root.left, k);
        } else if (k == leftCount + 1) {
            return root.val;
        } else {
            return kthSmallest(root.right, k - leftCount - 1);
        }
    }

    private int countNodes(TreeNode root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
