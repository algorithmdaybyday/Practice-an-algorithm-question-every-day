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
//O(N^2)time & O(N) space because of the height recalculation  
    public int treeHeight(TreeNode root){
	    if(root == null) return 0;
	    return Math.max(treeHeight(root.left), treeHeight(root.right))+1;
    }

}

// pass -1 to represent if the tree is unbalanced, this is 
// a bottom-up approach
public boolean isBalanced(TreeNode root) {
   return maxDepth(root) != -1;
}
private int maxDepth(TreeNode root) {
   if (root == null) return 0;
   int L = maxDepth(root.left);
   if (L == -1) return -1;
int R = maxDepth(root.right);
if (R == -1) return -1;
return (Math.abs(L - R) <= 1) ? (Math.max(L, R) + 1) : -1;
}

//
