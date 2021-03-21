class CheckForBST
{
    static boolean isBST(TreeNode root,int min,int max)
    {
        if(root == null) return true;
        return (root.val > min &&
                root.val < max &&
                isBST(root.left,min,root.val) &&
                isBST(root.right,root.val,max)
                );
    }
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(18);
        root.right.right = new TreeNode(40);

        final int min = Integer.MIN_VALUE;
        final int max = Integer.MAX_VALUE;
        System.out.print(isBST(root,min,max));
    }
}