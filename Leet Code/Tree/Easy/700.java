//700. Search in a Binary Search Tree


//Recursive O(n) and O(h)

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
    public TreeNode searchBST(TreeNode root, int val) {
        
        if(root == null) return null;
        if(root.val <val) return searchBST(root.right,val);
        if(root.val >val) return searchBST(root.left,val);
        
        return root;
        
        
    }
}

//Iterative 
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
    public TreeNode searchBST(TreeNode root, int val) {
       while (root != null)
        {
            final var this_val = root.val;
            if (this_val == val)
                return root;
            if (val < this_val)
                root = root.left;
            else
                root = root.right;
        }
        
        return null;
        
    }
}