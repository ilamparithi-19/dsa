package BinaryTree.Path;

import java.util.*;

import BinaryTree.Traversals.TreeNode;


/*
 * 113. Path Sum II
Medium

5304

114

Add to List

Share
Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum. Each path should be returned as a list of the node values, not node references.

A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.
 */


public class PathSum2 {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        findPaths(root, targetSum, new ArrayList<Integer>(), result);
        return result;
    }
    
    private void findPaths(TreeNode root, int sum, 
                           List<Integer> temp, List<List<Integer>> result) {
        
        if(root == null) {
            return;
        }
        temp.add(root.val);
        
        if(root.val == sum && root.left == null && root.right == null) {
            result.add(temp);
            return;
        }
        
        findPaths(root.left, sum - root.val, new ArrayList<>(temp), result);
        findPaths(root.right, sum - root.val, new ArrayList<>(temp), result);
    }

}
