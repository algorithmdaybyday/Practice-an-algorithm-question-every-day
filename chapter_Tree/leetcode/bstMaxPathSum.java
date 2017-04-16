/**Source: https://leetcode.com/problems/binary-tree-maximum-path-sum/#/solutions
 * 问题链接：https://leetcode.com/problems/binary-tree-maximum-path-sum/#/description
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	int maxValue;
    public int maxPathSum(TreeNode root) {
	maxValue = Integer.MIN_VALUE;
	maxPathDown(root);
	return maxValue;
    }

    private int maxPathDown(TreeNode node){
	    if(node == null) return 0;
	    int left = Math.max(0, maxPathDown(node.left));
	    int right = Math.max(0, maxPathDown(node.right));
	    maxValue = Math.max(maxValue, left + right + node.val);
	    return  Math.max(left,right) + node.val;

    }
}
