/**
 * Source; https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/#/description
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        TreeNode head = buildTree(nums, 0, nums.length-1);
        return head;
    }
    
    public TreeNode buildTree(int[] nums, int low, int high){
        if(low > high) return null;
        int mid = low + (high - low)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildTree(nums, low, mid-1);
        node.right = buildTree(nums, mid+1, high);
        return node;
    }
}
