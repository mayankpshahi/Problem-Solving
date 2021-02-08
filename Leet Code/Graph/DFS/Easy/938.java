//938. Range Sum of BST


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
     int l=0;
    int h=0;
    int rsum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        l = low;
        h = high;
        dfs(root);
        return rsum;
    }
    
    public void dfs(TreeNode root)
    {
        if(root == null)
            return;
        if(h < root.val)
            dfs(root.left);
        else if(l > root.val)
            dfs(root.right);
        else
        {
            rsum += root.val;
            dfs(root.left);
            dfs(root.right);
        }
        
        
        
    }
}