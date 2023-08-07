import java.util.Stack;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    Stack<Integer> tree1 = new Stack<>();
    Stack<Integer> tree2 = new Stack<>();
        
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        countLeaves(root1, tree1);
        countLeaves(root2, tree2);
        return tree1.equals(tree2);
    }
    
    private void countLeaves(TreeNode root, Stack<Integer> stack){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null) { // Only add leaf nodes
            stack.add(root.val);
        }
        countLeaves(root.left, stack);
        countLeaves(root.right, stack);
    }
}
