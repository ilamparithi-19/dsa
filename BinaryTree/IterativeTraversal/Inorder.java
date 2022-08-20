package BinaryTree.IterativeTraversal;

import java.util.*;
public class Inorder {
    
        class TreeNode {
            int data;
            TreeNode left;
            TreeNode right;
        }
        private List<TreeNode> inOrderTraversal(TreeNode root) {
            List<TreeNode> result = new ArrayList<>();
            Stack<TreeNode> tempStack = new Stack<>();
            while(true) {
                if(root != null) {
                    tempStack.push(root);
                    root = root.left;
                }
                else {
                    if(tempStack.isEmpty()) {
                        break;
                    }
                    TreeNode tempNode = tempStack.pop();
                    result.add(tempNode);
                    root = tempNode.right;
    
                }
            }
    
            return result;
        }
     }