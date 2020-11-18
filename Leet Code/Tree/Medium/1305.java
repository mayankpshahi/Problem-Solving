//1305. All Elements in Two Binary Search Trees


//O(nlogn)
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
    List<Integer> l = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        addToList(root1);
        addToList(root2);
        Collections.sort(l);
        return l;
        
    }
    public void addToList(TreeNode root) {
        if(root == null) return;
        
        addToList(root.left);
        l.add(root.val);
        addToList(root.right);
        
        
    } 
    
}