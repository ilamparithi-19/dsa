package BinaryTree.DepthWidth;

import BinaryTree.Node;

public class IsBST {
    class TreeNode
{
    int data;
    Node left, right;
 
    public TreeNode(int data)
    {
        this.data = data;
        left = right = null;
    }
}
    public boolean isBalanced(TreeNode root) {
        return isBalancedUtil(root) != -1;
    }
    
    private int isBalancedUtil(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int lh = isBalancedUtil(root.left);
        if(lh == -1) {
            return lh;
        }
        
        int rh = isBalancedUtil(root.right);
        if(rh == -1) {
            return rh;
        }
        if(Math.abs(lh-rh) > 1) {
            return -1;
        }
        return 1 + Math.max(lh, rh);
    }

}
