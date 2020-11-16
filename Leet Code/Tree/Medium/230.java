//230. Kth Smallest Element in a BST


//Recursive O(n) time and space
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
    List<Integer> l  =  new ArrayList<Integer>();
    public int kthSmallest(TreeNode root, int k) {
        
        inorderTraversal(root);
        return l.get(k-1);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        
        
        if (root == null) return l;
        
        inorderTraversal(root.left);
        
        l.add(root.val);
        
        return inorderTraversal(root.right);
        
        
        
    }
}

//Iterative Solution O(n) time and space


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
   
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> l  =  new ArrayList<Integer>();
        l = inorderTraversal(root);
        return l.get(k-1);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        Stack < TreeNode > stack = new Stack < > ();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
        
        
        
    }
}