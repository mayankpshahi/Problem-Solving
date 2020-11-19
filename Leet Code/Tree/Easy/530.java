//530. Minimum Absolute Difference in BST

//Recursive O(n)
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
    Integer pre;
    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }
    private void inorder(TreeNode root) {
	if (root == null)
		return;
	inorder(root.left);
	if (pre != null)
		min = Math.min(min, Math.abs(root.val - pre));
	pre = root.val;
	inorder(root.right);
}
}