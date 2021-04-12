

//124. Binary Tree Maximum Path Sum


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
    
    int res = Integer.MIN_VALUE;
     int solve(TreeNode root) {
          if(root==null) return 0;
        
        int l =  solve(root.left);
        int r =  solve(root.right);
        
        int temp =  Math.max(root.val,root.val + Math.max(l,r));
    
        
       int ans =  Math.max(temp,root.val+l+r);
        
        res =  Math.max(res,ans);
        
        
        return temp;
     }

    public int maxPathSum(TreeNode root) {
        solve(root);
     
     return res;
        
    }
}