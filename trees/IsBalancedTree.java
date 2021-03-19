class IsBalancedTree
{
    static int isBalancedTree(TreeNode root)
    {
        if(root == null) return 0;
        int lh = isBalancedTree(root.left);
        if(lh == -1) return -1;

        int rh - isBalancedTree(root.right);
        if(rh == -1) return -1;

        if(Math.abs(jh-rh) > 1) return -1;
        else return Math.max(lh,rh)+1;
        
    }
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(50);
        System.out.print(isBalancedTree(root));
    }
}