package BinaryTree.DepthWidth;

public class DiameterOfTree {

    class TreeNode
    {
        int data;
        TreeNode left, right;
     
        public TreeNode(int data)
        {
            this.data = data;
            left = right = null;
        }
    }

    public int maxDiameter(TreeNode root) {
        int[] dia = new int[1];
        height(root, dia);
        return dia[0];
    }
    int height(TreeNode root, int[] dia) {
        if(root == null) return 0; 
        
        int lh = height(root.left, dia); 
        int rh = height(root.right, dia); 
        dia[0] = Math.max(dia[0], lh+rh);
        return 1 + Math.max(lh, rh); 
    }
}
