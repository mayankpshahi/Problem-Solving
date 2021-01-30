//559. Maximum Depth of N-ary Tree

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
         if(root==null) return 0;
        
         Queue<Node> q = new LinkedList<Node>();
        int depth=0;
        q.offer(root);
        
       while(!q.isEmpty()){
            int size=q.size();
            depth++; //It will count every level
            for(int i=0;i<size;i++){
                Node parent=q.poll();//it will pop out all the nodes at current level
                for(Node child : parent.children){
                    q.offer(child);//It will add all the nodes current parent to the queue.
                }
            }
        }
        return depth;
    }
}