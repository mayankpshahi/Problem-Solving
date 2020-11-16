//617. Merge Two Binary Trees


//Recursive Solution O(m) time and O(m) space

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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        
        
        
        TreeNode m =  new TreeNode(t1.val + t2.val);
        m.left  =  mergeTrees(t1.left,t2.left);
        m.right =  mergeTrees(t1.right,t2.right);
        
        return m;
        
    }
}

//Iterative Solution using Stack O(n) time and space

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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
       Stack <TreeNode> s = new Stack <TreeNode>();
        s.push(t1);
        s.push(t2);
        if (t1 == null)
            return t2;
 
        while(!s.isEmpty())
        {
            TreeNode two = s.pop();
            TreeNode one = s.pop();
            
            if (one != null && two != null)
            {
                one.val += two.val;
                if (one.left == null){
                    one.left = two.left;
                }
                else
                {
                    s.push(one.left);
                    s.push(two.left);
                }
                      
                if (one.right == null){
                    one.right = two.right;
                }
                else
                {
                    s.push(one.right);
                    s.push(two.right);
                }  
            }     
        }
        return t1;  
        
    }
}