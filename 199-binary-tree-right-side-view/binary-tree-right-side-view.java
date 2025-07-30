class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            TreeNode rightMost = null;

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = q.poll();

                // The last node encountered in this level will be the rightmost
                rightMost = current;

                if (current.left != null) q.offer(current.left);
                if (current.right != null) q.offer(current.right);
            }

            // After the level, add the rightmost node's value
            result.add(rightMost.val);
        }

        return result;
    }
}
