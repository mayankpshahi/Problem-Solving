





//297. Serialize and Deserialize Binary Tree




/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb  =new StringBuilder();
        Queue<TreeNode> q =  new LinkedList<>();
        
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                if(curr==null){
                    sb.append("null");
                    sb.append("_");
                }else{
                    sb.append(String.valueOf(curr.val));
                    sb.append("_");
                    q.offer(curr.left);
                    q.offer(curr.right);
                }
            }
            
        }
        
        
        return sb.toString();
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] node = data.split("_");
         if (node[0].equals("null")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(node[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        for (int i = 1; i < node.length; i++) {
            TreeNode parent = q.poll();
            if (!node[i].equals("null")) {
                parent.left = new TreeNode(Integer.parseInt(node[i]));
                q.add(parent.left);
            }
            ++i;
            if (!node[i].equals("null")) {
                parent.right = new TreeNode(Integer.parseInt(node[i]));
                q.add(parent.right);
            }
        }
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));