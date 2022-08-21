package BinaryTree;

public class SearchBST {
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
    }

    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null && root.data != val)
            root = val < root.data ? root.left: root.right; 
        return root;
    }
}
