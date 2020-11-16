//105. Construct Binary Tree from Preorder and Inorder Traversal


//Recursive Solution O(n)

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return builder(0, 0, inorder.length - 1, preorder, inorder);
    }
    
    public TreeNode builder(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
    if (preStart > preorder.length - 1 || inStart > inEnd) {
        return null;
    }
    TreeNode root = new TreeNode(preorder[preStart]);
    int inIndex = 0; 
    for (int i = inStart; i <= inEnd; i++) {
        if (inorder[i] == root.val) {
            inIndex = i;
        }
    }
    root.left = builder(preStart + 1, inStart, inIndex - 1, preorder, inorder);
    root.right = builder(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);
    return root;
}
}



//Iterative Solution Stack

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
    public TreeNode buildTree(int[] pre, int[] in) {
   if (pre.length == 0)
		return null;
	Stack<TreeNode> stack = new Stack<>();
	TreeNode root = new TreeNode(pre[0]);
	stack.push(root);
	int preOrderIndex = 1;
	int inOrderIndex = 0;

	while (!stack.isEmpty()) {
		TreeNode top = stack.peek();
		TreeNode node;
		if (top.val != in[inOrderIndex]) {
			// Top node in the stack has not yet encountered its counterpart in inOrder,
			// so next element in pre must be left child of this node
			node = new TreeNode(pre[preOrderIndex++]);
			top.left = node;
		} else {
			// if all the elements in inOrder have been visted, we are done
			if (++inOrderIndex == in.length)
				break;
			stack.pop();
			// Check if there are still some unvisited nodes in the left sub-tree of the top node in the stack
			if (!stack.isEmpty() && (stack.peek().val == in[inOrderIndex]))
				continue;
			// As top node in stack still has not encontered its counterpart
			// in inOrder, so next element in pre must be right child of the removed node
			node = new TreeNode(pre[preOrderIndex++]);
			top.right = node;
		}
		stack.push(node);
	}
	return root;
}
}