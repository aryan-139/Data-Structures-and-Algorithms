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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=convertToTree(nums, 0, nums.length - 1);
        //pass the array, the starting index as well as the ending index of the array to the function
        return root;
    }
    public TreeNode convertToTree(int[] nums, int start, int end){
        //base case
        if(start>end){
            return null;
        }
        //find the middle element of the array
        int mid=(start+end)/2;
        //create a new node with the middle element as the root
        TreeNode root=new TreeNode(nums[mid]);
        //recursively call the function for the left and right subtree
        root.left=convertToTree(nums, start, mid-1);
        //pass the array, the starting index as well as the ending index of the array to the function so that the right subtree is created
        root.right=convertToTree(nums, mid+1, end);
        return root;
    }
}