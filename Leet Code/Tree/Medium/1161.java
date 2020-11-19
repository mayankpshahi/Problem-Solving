//1161. Maximum Level Sum of a Binary Tree


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
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue < TreeNode > q = new LinkedList < > ();
        q.add(root);
        int max = Integer.MIN_VALUE;
        int index = -1;
        int level = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            int sum = 0;
            int currLevel = level;
            while (size > 0) {
                TreeNode curr = q.poll();
                sum += curr.val;
                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
                size--;
            }

            if (max < sum) {
                max = sum;
                index = level;
            }
            level++;
        }
        return index;
        
    }
}