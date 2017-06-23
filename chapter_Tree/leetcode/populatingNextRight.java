/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
       if(root == null || root.left == null) return;
        connectNodes(root.left, root.right);
    }
    public void connectNodes(TreeLinkNode p, TreeLinkNode q){
        p.next = q;
        if(p.left!=null){
            connectNodes(p.right,q.left);
            connectNodes(p.left,p.right);
            connectNodes(q.left, q.right);  
        }
    }
}
