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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root== null) return res;
        helper(res, root, 0);
        return res;
    }
    
    public void helper(List<Integer> res, TreeNode node, int d){
        if(node==null) return;
        if(res.size() == d){
            res.add(node.val);
        }else{
            res.set(d, Math.max(node.val, res.get(d)));
        }
        helper(res, node.left, d+1);
        helper(res, node.right, d+1);
    }
}
