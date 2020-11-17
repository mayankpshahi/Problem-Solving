//897. Increasing Order Search Tree

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
    public List<TreeNode> l = new ArrayList<>();
    
    public void inOrderTraversal(TreeNode root,Queue l) {
        if (root == null)
            return;
        inOrderTraversal(root.left,l);
        l.add(root);
        inOrderTraversal(root.right,l);
    }
    public TreeNode increasingBST(TreeNode root) {
        Queue<TreeNode> list = new LinkedList<>();
        inOrderTraversal(root,list);
        TreeNode temp = new TreeNode(0),curr=temp;
        
        while(!list.isEmpty())
        {   curr.right = new TreeNode(list.remove().val);
            curr = curr.right;
        }
        
        return temp.right;
        
    }
}