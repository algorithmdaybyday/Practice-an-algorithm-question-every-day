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
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);   
    }
    public int sum(TreeNode root, int s){
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            return s*10 + root.val;
        }
        return sum(root.left, s*10 + root.val) + sum(root.right, s*10 + root.val);
    }
}
