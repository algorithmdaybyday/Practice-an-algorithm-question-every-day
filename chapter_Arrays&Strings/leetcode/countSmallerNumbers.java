
class Solution {
    
    class Node {
        Node left, right;
        int val, sum, dup = 1;
        public Node(int v, int s){
            val = v;
            sum = s;
        }
    }
    
    public List<Integer> countSmaller(int[] nums) {
        Integer [] result = new Integer [nums.length];
        Node root = null;
        for(int i=nums.length - 1; i>=0; i--){
            root = insert(nums[i], root, result, i, 0);
        }
        return Arrays.asList(result);
    }
    
    private Node insert(int num, Node node, Integer[] result, int i, int preSum){
        if (node == null) {
            node = new Node(num, 0);
            result[i] = preSum;
        } else if (node.val  == num) {
            node.dup++;
            result[i] = preSum + node.sum;
        } else if (node.val > num) {
            node.sum ++;
            node.left = insert(num, node.left, result, i, preSum);
        } else {
            node.right = insert(num, node.right, result, i, preSum + node.dup + node.sum);
        }
        return node;
    }
}
