//637. Average of Levels in Binary Tree

//O(n) Iterative
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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> res  = new ArrayList<>();
        if(root == null ) return res;
        
        Queue<TreeNode> q =  new LinkedList<>();
        q.offer(root);
        
        
        double level_sum = 0;
        while(!q.isEmpty()){
            level_sum = 0;
            int size = q.size();
            for(int i =0;i<size;i++){
                TreeNode curr = q.poll();
                level_sum +=curr.val;
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                
                
            }
            
            double level_avg = level_sum/size;
            res.add(level_avg);
            
        }
        return res;
        
    }
}