//606. Construct String from Binary Tree


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
    
    public String tree2str(TreeNode t) {
        if(t==null) return "";
       String s = String.valueOf(t.val);
       String left = tree2str(t.left);
       String right = tree2str(t.right);
       if (!right.equals("")) {
        s += "(" + left + ")" + "(" + right + ")";
        }
       else if (!left.equals("")) {
        s += "(" + left + ")";
         }
        return s;
        
    }
}


//Iterative O(n)

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
    
    public String tree2str(TreeNode t) {
         if (t == null) 
            return "";
        TreeNode dummy = new TreeNode(0);
        StringBuilder sb = new StringBuilder();
        Deque<TreeNode> s = new ArrayDeque<>();
        s.push(t);
        while (!s.isEmpty()) {
            TreeNode node = s.pop();
            if (node == dummy) {
                sb.append(')');
                continue;
            }
            sb.append('(').append(node.val);
            s.push(dummy);
            if (node.left == null && node.right != null)
                sb.append("()");
            if (node.right != null) 
                s.push(node.right);
            if (node.left != null) 
                s.push(node.left);
        }
        return sb.substring(1, sb.length() - 1);
        
    }
}