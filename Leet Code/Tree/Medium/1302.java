//1302. Deepest Leaves Sum


//Recursive

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
    int res =0;
    
    public int deepestLeavesSum(TreeNode root) {
        int height = heightTree(root);
        sum(root, height-1);
        return res;
    }
    
    public int heightTree(TreeNode cur) {
        if(cur == null) {
            return 0;
        } else {
            return Math.max(heightTree(cur.left), heightTree(cur.right))+1;
        }
    }
    
    public void sum(TreeNode cur, int h) {
        if(cur == null) {
            return;
        }
        if(h ==0){
            res = res + cur.val;
        }
        sum(cur.left, h-1);
        sum(cur.right,h-1);
    } 
}