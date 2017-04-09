public boolean isValidBST(TreeNode root){
	return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
}

public boolean isValidBST(TreeNode root, long lowerBound, long upperBound){
	if(root == null) return true;
	if(root.val >= upperBound || root.val <= lowerBound) return false;
	return isValidBST(root.left, lowerBound, root.val) && 
		isValidBST(root.right, root.val, upperBound);
}
