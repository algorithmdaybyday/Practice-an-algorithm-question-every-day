/**
 *Source: https://discuss.leetcode.com/topic/21474/accepted-java-simple-solution-in-8-lines
 *问题链接：https://leetcode.com/problems/binary-tree-paths/#/solutions
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
	if(root!=null)searchBT(root, "", result);
	return result;
    }

    private void searchBT(TreeNode root, String path, List<String>result){
	    if(root.left == null && root.right == null) result.add(path + root.val);
	    if(root.left != null ) searchBT(root.left, path + root.val + "->", result);
	    if(root.right != null) searchBT(root.right, path + root.val + "->", result);
}
