package BinaryTree.Views;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(10);
        tree = new TreeNode(10);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(7);
        tree.left.right = new TreeNode(8);
        tree.right.right = new TreeNode(15);
        tree.right.left = new TreeNode(12);
        tree.right.right.left = new TreeNode(14);
        rightSideView(tree);
    }
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> leftResult = new ArrayList<Integer>();
        List<Integer> rightResult = new ArrayList<Integer>();
        rightView(root, rightResult, 0);
        leftView(root, leftResult, 0);
        for(int val: leftResult) {
            System.out.println(val);
        }
        System.out.println("__________________________________");
        for(int val: rightResult) {
            System.out.println(val);
        }
        return leftResult;
    }

    private static void rightView(TreeNode root, List<Integer> result, int level) {
        if(root == null) {
            return;
        }
        if(level == result.size()) {
            result.add(root.data);
        }
        rightView(root.right, result, level+1);
        rightView(root.left, result, level+1);
    }

    private static void leftView(TreeNode root, List<Integer> result, int level) {
        if(root == null) {
            return;
        }
        if(level == result.size()) {
            result.add(root.data);
        }
        leftView(root.left, result, level+1);
        leftView(root.right, result, level+1);
    }
}