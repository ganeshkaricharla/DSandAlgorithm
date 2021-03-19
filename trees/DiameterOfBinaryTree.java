class DiameterOfBinaryTree
{
    static int height(TreeNode root)
    {
        if(root == null) return 0;

        return (Math.max(height(root.left),height(root.right)))+1;
    }
    static int diameter(TreeNode root)
    {
        if(root == null) return 0;

        int d1 = 1+height(root.left) + height(root.right);

        int d2 = diameter(root.left);
        int d3 = diameter(root.right);

        return Math.max(d1,Math.max(d2,d3));
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