package BinaryTree.Traversals;

import java.util.ArrayList;
import java.util.List;

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

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> result = new ArrayList<>();
       postorderTraversal(root, result);
       return result;
   }
   private void postorderTraversal(TreeNode root, List<Integer> ds) {
       if(root == null) {
           return;
       }
       
      
       postorderTraversal(root.left, ds);
       postorderTraversal(root.right, ds);
       ds.add(root.val);
   }
}