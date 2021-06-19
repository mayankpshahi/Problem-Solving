




//94. Binary Tree Inorder Traversal


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
    List<Integer> in = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        inorder(root);
        return in;
    }
    private void inorder(TreeNode root) {
        
        if(root!=null){
            inorder(root.left);
            in.add(root.val);
            inorder(root.right);
        }
        
    }
}