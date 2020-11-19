//653. Two Sum IV - Input is a BST


//Recursive  O(n)
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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> nums   = new ArrayList<>();
        inorder(root,nums);
        int start = 0,end  = nums.size() - 1;
        while(start<end){
            if(nums.get(start) + nums.get(end)<k) start++;
            else if(nums.get(start) + nums.get(end)>k) end--;
            else if(nums.get(start) + nums.get(end)==k) return true;
        }
        return false;
    }
    public void inorder(TreeNode root,List<Integer>nums){
        if(root == null) return;
        inorder(root.left,nums);
        nums.add(root.val);
        inorder(root.right,nums);
    }
}