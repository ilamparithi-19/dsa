package BinaryTree.Path;

import BinaryTree.TreeNode;

public class MaximumPathSum {
    public int maxPathSum(TreeNode root) {
        int maxVal[] = new int[1];
        maxVal[0] = Integer.MIN_VALUE;
        maxPathSumUtil(root, maxVal);
        return maxVal[0];
    }

    private int maxPathSumUtil(TreeNode node, int[] maxVal) {
        if(node == null) return 0;
        int left = Math.max(0, maxPathSumUtil(node.left, maxVal));
        int right = Math.max(0, maxPathSumUtil(node.right, maxVal));
        maxVal[0] = Math.max(maxVal[0], left+right+node.val);
        return Math.max(left, right) + node.val;
    }
 }
