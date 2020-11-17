//589. N-ary Tree Preorder Traversal


//Iterative O(n) time and space

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
    public List<Integer> preorder(Node root) {
        List<Integer> l  = new ArrayList<>();
        if (root == null) return l;
        
        Stack<Node> s = new Stack<>();
        s.add(root);
        
        while(!s.isEmpty()) {
            root = s.pop();
            l.add(root.val);
            for (int i = root.children.size() - 1; i >= 0; i--)
                s.add(root.children.get(i));
    
            
        }
    
        return l;
        
    }
}

//Recursive O(n) time and space

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
    List<Integer> l  = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        
         
       if (root == null) return l;
        
       l.add(root.val);
       for(Node n: root.children)
            preorder(n);
        
        
        
        return l;
        
        
    }
}