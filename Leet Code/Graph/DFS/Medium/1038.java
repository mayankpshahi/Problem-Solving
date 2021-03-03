
//1038. Binary Search Tree to Greater Sum Tree

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
    public TreeNode bstToGst(TreeNode root) {
     dfs(root,0);
     return root;
    }
    
    private static int dfs(TreeNode root, int sum){
	if(root == null)
		return sum;

	int right_sum = dfs(root.right, sum);
	root.val += right_sum;
	int left_sum = dfs(root.left, root.val);

	return left_sum;
}
}