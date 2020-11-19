//107. Binary Tree Level Order Traversal II



//O(nh) Recursive
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
    List<List<Integer>> ll = new LinkedList<List<Integer>>();
    List<Integer> l;
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        int h = height(root);
        l = new LinkedList<>();
        for(int i = h ; i > 0; i--) {
            level(root, i);
            ll.add(l);
            l = new LinkedList<Integer>();
        }
        return ll;
        
    }
    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public void level(TreeNode root, int h) {
        if(root == null) {
            return;
        }
        if(h == 1) {
            l.add(root.val);
            return;
        }
        level(root.left, h - 1);
        level(root.right, h - 1);
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> list = new LinkedList<>();
		if(root==null)return list;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		List<Integer> temp=  new LinkedList<>();
		while(q.size()!=1){
			TreeNode x = q.poll();
			if(x==null){
				list.addFirst(temp);
				temp = new LinkedList<>();
				q.add(x);
			}
			else{
				temp.add(x.val);
				if(x.left!=null)q.add(x.left);
				if(x.right!=null)q.add(x.right);
			}
		}
		  list.addFirst(temp);
		return list;
    }
}