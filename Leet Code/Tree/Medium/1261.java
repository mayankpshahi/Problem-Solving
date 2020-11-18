//1261. Find Elements in a Contaminated Binary Tree


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
class FindElements {
    private Set<Integer> s;

    public FindElements(TreeNode root) {
        s = new HashSet<Integer>();
        recoverBT(root, null);
        
    }
    
    public boolean find(int target) {
        return s.contains(target);
    }
     private void recoverBT(TreeNode node, TreeNode parent) {
        
        if (node == null)
            return;
        
        if (parent == null)
            node.val = 0;
        else
            node.val = node == parent.left? 2 * parent.val + 1: 2 * parent.val + 2;
        
        s.add(node.val);
        
        recoverBT(node.left, node);
        recoverBT(node.right, node);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */