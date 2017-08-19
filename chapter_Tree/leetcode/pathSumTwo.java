/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>>res = new ArrayList<List<Integer>>();
        List<Integer> currentList = new ArrayList<>();
        helper(root, sum, res, currentList);
        return res;
    }
    
    public void helper(TreeNode node, int sum, List<List<Integer>> res, List<Integer> currentList){
        if(node==null) return;
        currentList.add(node.val);
        if(node.left == null && node.right == null && node.val == sum) {
            res.add(new ArrayList(currentList));
        }else{
            helper(node.left, sum - node.val, res, currentList);
            helper(node.right, sum - node.val, res, currentList);
        }
        currentList.remove(currentList.size() - 1);
    }
}
