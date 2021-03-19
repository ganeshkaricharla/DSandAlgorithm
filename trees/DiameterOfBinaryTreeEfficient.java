class DiameterOfBinaryTree
{
    int res = 0;
    static int diameter(TreeNode root)
    {
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        res  = Math.max(res,lh+rh + 1);

        return 1 + Math.max(lh,rh);
    }
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(40);    
        root.right.right = new TreeNode(50);

        System.out.print(diameter(root));
    }
}