package BinaryTree;

import java.util.List;

 
class TreeNode {
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

class Solution {
   
    public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> result = new ArrayList<>();
      preorderTraversalUtil(root, result);
      return result;
  }
  private void preorderTraversalUtil(TreeNode root, List<Integer> ds) {
      if(root == null) {
          return;
      }
      
      ds.add(root.val);
      preorderTraversalUtil(root.left, ds);
      preorderTraversalUtil(root.right, ds);
  }
}