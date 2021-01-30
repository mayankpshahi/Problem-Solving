//107. Binary Tree Level Order Traversal II

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
    List<List<Integer>> l  =  new ArrayList();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
         if(root==null) return l;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
         q.offer(root);
        
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> curr  =  new ArrayList<Integer>();
            for(int i=0;i<size;i++){
                TreeNode parent=q.poll();
                curr.add(parent.val);
                if(parent.left!=null)
                    q.offer(parent.left);
                if(parent.right!=null)
                    q.offer(parent.right);
                
            }
            l.add(curr);
        }
        
        Collections.reverse(l);
        
        return l;
    }
    
}