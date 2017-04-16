/**
 * Question: https://leetcode.com/problems/symmetric-tree/#/description
 * Solution Source: https://discuss.leetcode.com/topic/5941/recursive-and-non-recursive-solutions-in-java
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
    	return root == null || isSymmtricHelper(root.left, root.right);   
    }

    private boolean isSymmetricHelper(TreeNode left, TreeNode right){
	    if(left==null||right==null)
		    return left == right;
	    if(left.val != right.val)
		    return false;
	    return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
    }
}
