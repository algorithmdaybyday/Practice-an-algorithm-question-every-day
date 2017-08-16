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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> cols = new LinkedList<>();
        
        queue.add(root);
        cols.add(0);
        
        int min = 0;
        int max = 0;
        if(root == null) return res;
        while(!queue.isEmpty()){
            TreeNode n = queue.poll();
            int col = cols.poll();
            if(!map.containsKey(col)){
                map.put(col, new ArrayList<Integer>());
            }
            map.get(col).add(n.val);
            if(n.left!=null){
                queue.add(n.left);
                cols.add(col-1);
                min = Math.min(min, col-1);
            }
            if(n.right!=null){
                queue.add(n.right);
                cols.add(col+1);
                max = Math.max(max, col+1);
            }

        }
                
        for(int i=min; i<=max; i++){
            res.add(map.get(i));
            }
        return res;
    }
}
