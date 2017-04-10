//第一种写法使用了递归深度优先搜索 但当树结构太大时有可能导致栈溢出
//第二种写法为优化后的使用自定义队列的广度优先搜索
public TreeNode invertTree(TreeNode root){
	if(root == null) {
		return null;
	}
	final TreeNode left = root.left,
	      right = root.right;
	root.left = invertTree(right);
	root.right = invertTree(left);
	return root;

}
public TreeNode invertTree(TreeNode root) {
    
        if (root == null) {
		return null;
        }

        final Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            final TreeNode node = queue.poll();
            final TreeNode left = node.left;
            node.left = node.right;
            node.right = left;

            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
        }
        return root;
    }
}
