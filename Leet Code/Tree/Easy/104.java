//104. Maximum Depth of Binary Tree


// Recursive Solution O(n)
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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        int depthl = 0;
        int depthr = 0;
        
        
        depthl  = maxDepth(root.left);
        depthr  = maxDepth(root.right);
        
        return 1+Math.max(depthl,depthr);
        
    }
}

//Iterative using 2 stacks

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
    public int maxDepth(TreeNode root) {
        int max = 0;
    if (root == null) {return 0;}
    Stack<TreeNode> path = new Stack<>();
    Stack<Integer> sub = new Stack<>();
    path.push(root);
    sub.push(1);
    while (!path.isEmpty()) {
        TreeNode temp = path.pop();
        int tempVal = sub.pop();
        if (temp.left == null && temp.right == null) {max = Math.max(max, tempVal);}
        else {
            if (temp.left != null) {
                path.push(temp.left);
                sub.push(tempVal + 1);
            }
            if (temp.right != null) {
                path.push(temp.right);
                sub.push(tempVal + 1);
            }
        }
    }
    return max;
    }
}