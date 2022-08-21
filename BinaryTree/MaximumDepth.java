package BinaryTree;


public class MaximumDepth {
//     public boolean isBalanced(TreeNode root) {
//         return isBalancedUtil(root) != -1;
//     }
    
//     private int isBalancedUtil(TreeNode root) {
//         if(root == null) {
//             return 0;
//         }
        
//         int lh = isBalancedUtil(root.left);
//         if(lh == -1) {
//             return lh;
//         }
        
//         int rh = isBalancedUtil(root.right);
//         if(rh == -1) {
//             return rh;
//         }
//         if(Math.abs(lh-rh) > 1) {
//             return -1;
//         }
//         return 1 + Math.max(lh, rh);
//     }

// }

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
