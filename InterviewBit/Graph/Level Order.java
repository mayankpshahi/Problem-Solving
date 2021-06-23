


//Level Order






/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        Queue<TreeNode> q =  new LinkedList<>();
        q.add(A);
        ArrayList<ArrayList<Integer>> ans =  new ArrayList<>();
        
        while(!q.isEmpty()){
            ArrayList<Integer> l = new ArrayList<>();
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                l.add(node.val);
                if(node.left!=null){
                     q.add(node.left);
                }
                if(node.right!=null){
                     q.add(node.right);
                }
            }
            ans.add(l);
            
        }
        
        return ans;
    }
}