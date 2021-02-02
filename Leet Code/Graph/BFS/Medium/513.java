//513. Find Bottom Left Tree Value

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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null) return 0;
         if(root.left==null && root.right==null) return root.val;
        
        
         int value=0;
        
        Queue<TreeNode> q  = new LinkedList<TreeNode>();
        q.offer(root);
        
         while(!q.isEmpty()){
            int size = q.size();
            boolean flag = false;
            for(int i=0;i<size;i++){
                TreeNode parent=q.poll();
                
                if(parent.left!=null){
                    q.offer(parent.left);
                }
                if(parent.right!=null)
                     q.offer(parent.right);
                
                if(parent.left==null && parent.right==null){
                    
                    if(!flag){
                    value = parent.val;
                    flag=!flag;
                    }
                    
                }
            }
                
            
         }
            
         return value;   
    }
}