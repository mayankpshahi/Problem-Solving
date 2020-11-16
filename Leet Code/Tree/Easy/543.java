//543. Diameter of Binary Tree


//Recursive Solution

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
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
			return 0;
		}
        int option1 = maxDepth(root.left) + maxDepth(root.right);
        int option2 = diameterOfBinaryTree(root.left);
		int option3 = diameterOfBinaryTree(root.right);
		return Math.max(option1, Math.max(option2, option3));
        
    }
    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        
        int depthl = 0;
        int depthr = 0;
        
        
        depthl  = maxDepth(root.left);
        depthr  = maxDepth(root.right);
        
        return 1+Math.max(depthl,depthr);
    }
}

//More optimized Recursive Solution

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
    
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 1;
        maxDepth(root);
        return diameter-1;
        
    }
    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        
        int depthl = 0;
        int depthr = 0;
        
        
        depthl  = maxDepth(root.left);
        depthr  = maxDepth(root.right);
        diameter = Math.max(diameter,depthl+depthr+1);
        return Math.max(depthr,depthl)+1;
    }
}