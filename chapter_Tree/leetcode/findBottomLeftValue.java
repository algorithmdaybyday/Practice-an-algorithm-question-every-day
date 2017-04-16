/*
 * Question Source: https://leetcode.com/problems/find-bottom-left-tree-value/#/description
 * Solution Source: https://discuss.leetcode.com/topic/78981/right-to-left-bfs-python-java
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    // （非常聪明的广度优先搜索改写）
	public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
	queue.add(root);
	while(!queue.isEmpty()){
		root = queue.poll();
		if(root.right != null)
			queue.add(root.right);
		if(root.left != null)
			queue.add(root.left);
	}
	return root.val;
    }
}
