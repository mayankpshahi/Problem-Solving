//1315. Sum of Nodes with Even-Valued Grandparent


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
    int nodeSum = 0;
    public int sumEvenGrandparent(TreeNode root) {
        if(root == null)return 0;
        sum(root,null,null);
        return nodeSum;
    }
    public void sum(TreeNode root,TreeNode pa, TreeNode grandPa){
        if(root == null)return ;
        
        if(grandPa != null && grandPa.val %2 == 0){
            nodeSum += root.val;
        }
        sum(root.left,root,pa);
        sum(root.right,root,pa);
    }
}