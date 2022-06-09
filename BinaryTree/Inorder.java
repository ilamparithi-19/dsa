package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Inorder {

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
 
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversalUtil(root, result);
        return result;
    }
    private void inorderTraversalUtil(TreeNode root, List<Integer> ds) {
        if(root == null) {
            return;
        }
        inorderTraversalUtil(root.left, ds);
        ds.add(root.val);
        inorderTraversalUtil(root.right, ds);
    }

}
