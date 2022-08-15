package BinaryTree;

/*
 * 98. Validate Binary Search Tree
Medium

11939

981

Add to List

Share
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class IsValidBST {
    
    public boolean isValidBST(TreeNode root) {
        return isBstUtil(root, null, null);
    }
    
    private boolean isBstUtil(TreeNode root, Integer min, Integer max) {
        if(root == null) {
            return true;
        }
        if(max != null && root.val >= max || min != null && root.val <= min) {
            return false;
        }
        
        return isBstUtil(root.left, min, root.val) && isBstUtil(root.right, root.val, max);
    }
}
