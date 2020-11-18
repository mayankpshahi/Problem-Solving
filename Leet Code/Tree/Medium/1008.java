//1008. Construct Binary Search Tree from Preorder Traversal

//Recursive O(n);
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
    
    public TreeNode bst(TreeNode root,int curr)
    {
        if(root == null) return new TreeNode(curr);
        if(root.val>curr) root.left  = bst(root.left,curr);
        if(root.val<curr) root.right = bst(root.right,curr);
        
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for(int i =1;i<preorder.length;i++){
            root = bst(root,preorder[i]);
        }
        return root;
    }
}

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
    
    
    public TreeNode bstFromPreorder(int[] preorder) {
        
         if(preorder == null){
            return null;
        }
        
        if(preorder.length==0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
		
        for(int i=1;i<preorder.length;i++){
             generateBST(preorder[i],root);
        }
        return root;
        
    }
    public void generateBST(int target, TreeNode tree){
        TreeNode root = tree;
        TreeNode node = new TreeNode(target);
            while(root!=null){
                if(target<root.val){
                    if(root.left==null){
                        root.left = node;
                        break;
                    }
                    else root=root.left;
                }else{
                    if(root.right==null){
                        root.right=node;
                        break;
                    }else root=root.right;
                    
                }
            }
      }
}