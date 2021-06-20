






//Kth Smallest Element In Tree





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
    private ArrayList<Integer> list;
public int kthsmallest(TreeNode A, int B) {
list=new ArrayList<>();
inorder(A);
return list.get(B-1);
}

public void inorder(TreeNode A) {
    if(A!=null) {
        inorder(A.left);
        list.add(A.val);
        inorder(A.right);
    }
    else return ;
}
}
