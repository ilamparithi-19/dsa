package BinaryTree.DepthWidth;


public class MaximumDepth {


 public int maxDepth(TreeNode root) {
     if (root == null) {
         return 0;
     }
     int lh = 1 + maxDepth(root.left);
     int rh = 1 + maxDepth(root.right);
     return Math.max(lh, rh);
 }
}
//BFS - Level Order traversal also another solution
