//993. Cousins in Binary Tree


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
    public boolean isCousins(TreeNode root, int x, int y) {
        
        if(root==null) return false;
        if(root.val==x && x==y) return true;
        else if((root.val==x || root.val==y)&&x!=y) return false;
        
        int parentarr [] =  new int[2];
        int depth[] = new int[2];
        
         int level=0;
        
        Queue<TreeNode> q  = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            level++;
            for(int i=0;i<size;i++){
                TreeNode parent=q.poll();
                
                if(parent.left!=null){
                    q.offer(parent.left);
                    if(parent.left.val == x){
                        parentarr[0] = parent.val;
                        depth[0] = level;
                    }
                    if(parent.left.val == y){
                        parentarr[1] = parent.val;
                        depth[1] = level;
                    }
                }
                if(parent.right!=null){
                    q.offer(parent.right);
                    if(parent.right.val == x){
                        parentarr[0] = parent.val;
                        depth[0] = level;
                    }
                    if(parent.right.val == y){
                        parentarr[1] = parent.val;
                        depth[1] = level;
                    }
                }
                
            }
            
            
            
        }
        if(parentarr[0]!=parentarr[1] && depth[0]==depth[1])
            return true;
        else
            return false;
        
    }
}