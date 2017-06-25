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
    public int kthSmallest(TreeNode root, int k) {
        int count = countNodes(root.left);
        if (k <= count) {
            return kthSmallest(root.left, k);
        } else if (k > count + 1) {
            return kthSmallest(root.right, k - 1 - count);
        } 
        return root.val;
    }
    
    public int countNodes(TreeNode n){
        if(n == null) return 0;
        return 1 + countNodes(n.left) + countNodes(n.right);
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
    private static int number = 0;
    private static int count = 0;
    
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return number;
    }
    
    private void helper(TreeNode n) {
        if (n.left != null) helper(n.left);
        count--;
        if(count == 0) {
            number = n.val;
            return;
        }
        if (n.right != null) helper(n.right);
    }
}}
