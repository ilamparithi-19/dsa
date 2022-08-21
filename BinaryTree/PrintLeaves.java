package BinaryTree;

import BinaryTree.Traversals.TreeNode;

public class PrintLeaves {

    public static void main(String[] args) throws Exception {
  
      // let's create a binary tree
      TreeNode d = new TreeNode("d");
      TreeNode e = new TreeNode("e");
      TreeNode g = new TreeNode("g");
      TreeNode k = new TreeNode("k");
  
      TreeNode c = new TreeNode("c", d, null);
      TreeNode h = new TreeNode("h", k, null);
  
      TreeNode b = new TreeNode("b", c, e);
      TreeNode f = new TreeNode("f", g, h);
  
      TreeNode root = new TreeNode("a", b, f);
  
      // print all leaf nodes of binary tree using recursion
      System.out
          .println("Printing all leaf nodes of binary tree in Java
                    (recursively)");
      printLeaf(root);
  
    }
  
    /**
     * A class to represent a node in binary tree
     */
    private static class TreeNode {
      String value;
      TreeNode left;
      TreeNode right;
  
      TreeNode(String value) {
        this.value = value;
      }
  
      TreeNode(String data, TreeNode left, TreeNode right) {
        this.value = data;
        this.left = left;
        this.right = right;
      }
  
      boolean isLeaf() {
        return left == null ? right == null : false;
      }
    }
  
    /**
     * Java method to print leaf nodes using iteration
     * 
     * @param root
     * 
     */
    public static void printLeaf(TreeNode root) {
  
      if (root == null) {
        return;
      }
      Stack<TreeNode> stack = new Stack<>();
      stack.push(root);
  
      while (!stack.isEmpty()) {
        TreeNode node = stack.pop();
  
        if (node.left != null) {
          stack.add(node.left);
        }
  
        if (node.right != null) {
          stack.add(node.right);
        }
  
        if (node.isLeaf()) {
          System.out.printf("%s ", node.value);
        }
  
      }
  
    }
  }