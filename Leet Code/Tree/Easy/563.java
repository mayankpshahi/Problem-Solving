//563. Binary Tree Tilt

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
    int sum = 0;
    public int findTilt(TreeNode root) {
        
        
        findTiltSum(root);
        return sum;
        
        
    }
     private int findTiltSum(TreeNode root) {
        if(root==null) return 0;
        int lSum = findTiltSum(root.left);
        int rSum = findTiltSum(root.right);
        sum += Math.abs(lSum-rSum);
        return lSum+rSum+root.val;
    }
}