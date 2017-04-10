/**
 * Source: https://discuss.leetcode.com/topic/6575/my-solutions-in-3-languages-with-stack
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 * calling next() will return the next smallest number in the BST
 * next() and hasNext() should run in O(1) and use O(h), where h is the height of the tree
 */

public class BSTIterator {
    private Stack<TreeNode>stack = new Stack<TreeNode>();
    public BSTIterator(TreeNode root) {
	pushAll(root);	       
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode tmpNode = stack.pop();
	pushAll(tmpNode.right);
	return tmpNode.val;
    }

    private void pushAll(TreeNode node){
	    for(;node != null; stack.push(node), node = node.left);
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
