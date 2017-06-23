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
	//O(n) running time and O(logN) space
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null) return midDepth(root.right)+1;
        if(root.right==null) return midDepth(root.left)+1;
        return Math.min(minDepth(root.left), minDepth(root.right))+1;
    }
}
//O(N) running time and O(N) space with with BFS

public int minDepth(TreeNode root) {
	    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode rightMost = root;
        int depth = 1;
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node.left==null && node.right==null) break;
            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
            if(node==rightMost){
                depth++;
                rightMost = (node.right!=null) ? node.right : node.left;
            }
        }
        return depth;
    }

}

