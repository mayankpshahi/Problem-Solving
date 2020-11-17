//938. Range Sum of BST


//O(n) and O(h) Iterative
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        
      Stack<TreeNode> st  = new Stack<>();
        
        st.push(root);
        int rangeSum = 0;
        
        while(!st.isEmpty()){
            TreeNode curr  = st.pop();
            if(curr == null) continue;
            if(curr.val >low) st.push(curr.left);
            if(curr.val<high) st.push(curr.right);
            if(curr.val>=low && curr.val<=high) rangeSum+=curr.val;
        }
        return rangeSum;
    
        
        
        
        
    }
}


//Recursive O(n) and O(h)

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        if (root.val < low) return rangeSumBST(root.right, low, high);
        if (root.val > high) return rangeSumBST(root.left, low, high); 
        return root.val + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high);
    
        
        
        
        
    }
}