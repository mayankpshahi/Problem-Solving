//1022. Sum of Root To Leaf Binary Numbers


//Recursive O(n) and O(h)
//Also read all Solution given by leetcode

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
    
    public int sumRootToLeaf(TreeNode root) {
        if(root == null) return 0;
        
        return total(root,0);
        
    }
    private int total(TreeNode root, int prevSum) {
        if(root==null) {
            return 0;
        }
        prevSum = 2*prevSum + root.val; 
        
        if(root.left == null && root.right == null) {
            return prevSum; 
        }
        return total(root.left, prevSum) + total(root.right, prevSum);
    }
}