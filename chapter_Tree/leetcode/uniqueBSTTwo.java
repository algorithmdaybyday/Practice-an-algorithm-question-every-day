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
    public List<TreeNode> generateTrees(int n) {
        if (n <= 0) return new ArrayList<>();
        return generate(1, n);
    }
    
    private List<TreeNode> generate(int start, int end) {
        if (start > end) return Arrays.asList(new TreeNode[]{null});
        List<TreeNode> ret = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            for (TreeNode left : generate(start, i - 1)) {
                for (TreeNode right : generate(i + 1, end)) {
                    TreeNode root = new TreeNode(i);
                    root.left = left; 
                    root.right = right;
                    ret.add(root);
                }
            }
        }
        return ret;
    }
}
