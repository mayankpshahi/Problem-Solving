
//Leaves in Same Level

import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    boolean flag  = false;
    Set<Integer> s =  new HashSet<Integer>();
    public boolean solve(Tree root) {
        int depth = 0;
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        else{
        dfs(root.right,depth+1);
        dfs(root.left,depth+1);
        if(s.size()==1)
        return true;
        else
        return false;
        }
    }

    public void dfs(Tree root,int depth)
    {    
        
        if(root!=null){
        if (root.left == null && root.right == null){
            s.add(depth);
        }
        else{
        dfs(root.right,depth+1);
        dfs(root.left,depth+1);
        }
        } 
        
        
    }
}