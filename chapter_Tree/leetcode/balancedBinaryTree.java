/*
 * 问题链接： 
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
 	if(root == null) return true;
	int left = treeHeight(root.left);
	int right = treeHeight(root.right);
	return Math.abs(left-right)<=1 && isBalanced(root.left) && isBalanced(root.right);	
    }

    public int treeHeight(TreeNode root){
	    if(root == null) return 0;
	    return Math.max(treeHeight(root.left), treeHeight(root.right))+1;
    }

}
