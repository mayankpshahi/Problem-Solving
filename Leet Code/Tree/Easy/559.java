//559. Maximum Depth of N-ary Tree


//Recursive O(n) 
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
    int maxd = 0;
    public int maxDepth(Node root) {
        if(root == null) return maxd;
        
        helper(root,1);
        return maxd;
        
    }
    
    private void helper(Node n, int level){
        if(n == null)
            return;
        
        maxd = Math.max(maxd, level);
        for(int i = 0; i < n.children.size(); i++){
            helper(n.children.get(i), level + 1);
        }
    }
    
}


//Iterative

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
       if (root == null)
		return 0;
	  if (root.children == null)
		return 1;

	Queue<Node> queue = new LinkedList<>();
	queue.add(root);
	int level = 0;
	while (queue.size() > 0) {
		level++;

		var curQueueSize = queue.size();
		while (curQueueSize > 0) {
			curQueueSize--;
			final var node = queue.remove();
			if (node.children != null)
				node.children.forEach(x -> queue.add(x));
		}
	}

	return level;
        
    }
    
}