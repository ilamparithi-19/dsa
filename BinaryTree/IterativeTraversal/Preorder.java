package BinaryTree.IterativeTraversal;

import java.util.*;


public class Preorder {

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
    }
    private List<TreeNode> preOrderTraversal(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        Stack<TreeNode> tempStack = new Stack<>();
        tempStack.push(root);
        while(!tempStack.isEmpty()) {
            TreeNode curr = tempStack.pop();
            result.add(curr);
            if(curr.right != null) {
                tempStack.push(root.right);
            }
            if(curr.left != null) {
                tempStack.push(root.left);
            }
        }

        return result;
    }
 }
