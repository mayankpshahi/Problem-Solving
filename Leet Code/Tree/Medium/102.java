//102. Binary Tree Level Order Traversal


//Recursive O(n) time
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
    List<List<Integer>> res  =  new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
         
        levelOrderList(root,1);
        return res;
        
}
    private void levelOrderList(TreeNode root, int level){
        if(root==null)
            return;
        if(res.size()<level)
            res.add(new ArrayList());
        res.get(level-1).add(root.val);
        levelOrderList(root.left,level+1);
        levelOrderList(root.right,level+1);
    }
    
    
}

//Iterative O(n) time

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
    
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> output = new ArrayList<>();
        if(root==null){
            return output;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list1 = new ArrayList<>();
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                list1.add(node.val);
                if(node.left!=null){
                     queue.add(node.left);
                }
                if(node.right!=null){
                     queue.add(node.right);
                }
            }   
            output.add(list1);
        }
        return output;
        
}
    
}