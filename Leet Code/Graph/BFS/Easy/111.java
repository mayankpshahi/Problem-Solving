//111. Minimum Depth of Binary Tree


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
    public int minDepth(TreeNode root) {
         if(root==null) return 0;
         if(root.left==null && root.right==null) return 1;
        
        
         int level=0;
        
        Queue<TreeNode> q  = new LinkedList<TreeNode>();
        q.offer(root);
        
         while(!q.isEmpty()){
            int size = q.size();
            level++;
            for(int i=0;i<size;i++){
                TreeNode parent=q.poll();
                
                if(parent.left!=null)
                    q.offer(parent.left);
                   
            
                if(parent.right!=null)
                     q.offer(parent.right);
                
                if(parent.left==null && parent.right==null)
                    return level;
                
            }
                
            
         }
            
         return level;   
            
        }
        
    
}