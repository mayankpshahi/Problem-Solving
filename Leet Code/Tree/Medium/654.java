//654. Maximum Binary Tree

//Recursive O(n^2)  and O(n)

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
    
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
         return maxBuilder(0,nums.length,nums);
    }
    
    private TreeNode maxBuilder(int left, int right, int[] nums) {
        if(left == right)
            return null;
        int ind= -1;
        int max = Integer.MIN_VALUE;
        for(int i=left; i<right; i++) {
            if(nums[i] > max) {
                max = nums[i];
                ind = i;
            }
        }
        TreeNode cur = new TreeNode(max);
        cur.left = maxBuilder(left, ind, nums);
        cur.right = maxBuilder(ind+1, right, nums);
        return cur;
    }
}