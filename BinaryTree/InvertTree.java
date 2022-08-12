package BinaryTree;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
}
class InvertTree {
    private TreeNode invertTree(TreeNode node) {
        if(node == null) {
            return node;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        invertTree(node.left);
        invertTree(node.right);
        return node;
    }
}
