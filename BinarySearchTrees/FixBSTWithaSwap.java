class FixBSTWithaSwap
{
    TreeNode prev = null;
    TreeNode first = null;
    TreeNode second = null;
    static void fixBST(TreeNode root)
    {
        if(root == null) return;

        fixBST(root.left);

        if(prev != null && root.key < prev.key)
        {
            if(first == null)
            {
                first = prev;
            }
            second = root;
        }
        prev = root;
        fixBST(root.right);
    }
    public static void main(String[] args)
    {
        TreeNode root=new TreeNode(18);
    	root.left=new TreeNode(5);
    	root.left.left=new TreeNode(3);
    	root.right=new TreeNode(20);
    	root.right.left=new TreeNode(15);
    	root.right.left.left=new TreeNode(16);
    	root.right.right=new TreeNode(80);
        fixBST(root);  
    }
}