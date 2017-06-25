public boolean isValidBST(TreeNode root){
	return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
}

public boolean isValidBST(TreeNode root, long lowerBound, long upperBound){
	if(root == null) return true;
	if(root.val >= upperBound || root.val <= lowerBound) return false;
	return isValidBST(root.left, lowerBound, root.val) && 
		isValidBST(root.right, root.val, upperBound);
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private boolean help(TreeNode p, Integer low, Integer high) {
        if (p == null) return true;
        return (low == null || p.val > low) && (high == null || p.val < high) && help(p.left, low, p.val) && help(p.right, p.val, high);
    }

    public boolean isValidBST(TreeNode root) {
        return help(root, null, null);
    }
}
