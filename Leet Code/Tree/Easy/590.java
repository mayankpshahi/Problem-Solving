//590. N-ary Tree Postorder Traversal


//Iterative o(n) time and space

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
    public List<Integer> postorder(Node root) {
        List<Integer> l  = new ArrayList<>();
        if (root == null) return l;
        
        Stack<Node> s = new Stack<>();
        s.add(root);
        
        while(!s.isEmpty()) {
            root = s.pop();
            l.add(root.val);
            for(Node n: root.children)
                s.add(n);
        }
         Collections.reverse(l);
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
    public List<Integer> postorder(Node root) {
        
        if (root == null) return l;
        
       for(Node n: root.children)
            postorder(n);
        
        l.add(root.val);
        
        return l;
        
    }
}