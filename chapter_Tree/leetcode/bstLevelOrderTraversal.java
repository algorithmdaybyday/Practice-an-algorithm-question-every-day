/**Source: https://leetcode.com/problems/binary-tree-level-order-traversal/#/solutions
 * 问题链接：https://leetcode.com/problems/binary-tree-level-order-traversal/#/description
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
	if(root==null) return wrapList;
	queue.offer(root);
	while(!queue.isEmpty()){
		int levelNum = queue.size();
		List<Integer>subList = new LinkedList<Integer>();
		for(int i = 0; i<levelNum; i++){
			if(queue.peek().left != null) queue.offer(queue.peek().left);
			if(queue.peek().right != null) queue.offer(queue.peek().right);
			subList.add(queue.poll().val);
    }
    wrapList.add(subList);
	}
	return wrapList;
    }
}
