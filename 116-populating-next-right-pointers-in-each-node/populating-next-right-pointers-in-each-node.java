/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        helper(root,null);
        return root;
    }

    private void helper(Node root, Node parent){
        //think of the base case
        if(root==null)
        return;

        if(parent!=null)
        parent.left.next=parent.right;

        if(parent!=null && parent.next!=null)
        parent.right.next=parent.next.left;

        if(root.left!=null && root.right == null)
        return;

        helper(root.left, root);
        helper(root.right, root);
    }
}