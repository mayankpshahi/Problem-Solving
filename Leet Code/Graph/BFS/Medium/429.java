//429. N-ary Tree Level Order Traversal

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
    List<List<Integer>> l =  new ArrayList();
    public List<List<Integer>> levelOrder(Node root) {
         if(root==null) return l;
        
         Queue<Node> q = new LinkedList<Node>();

        q.offer(root);
        
       while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level =  new ArrayList<Integer>();
            for(int i=0;i<size;i++){
                Node parent=q.poll();
                level.add(parent.val);
                for(Node child : parent.children){
                    q.offer(child);
                }
            }
           l.add(level);
        }
        return l;
        
    }
}