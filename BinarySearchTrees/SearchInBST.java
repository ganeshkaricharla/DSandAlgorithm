class SearchInBST
{
    static boolean searchInBST(TreeNode root,int target)
    {
        while(root != null)
        {
            if(root.val == target)
            {
                return true;
            }
            if(root.val > target)
            {
                root = root.left;
            }
            else
            {
                root = root.right;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        TreeNode root=new TreeNode(15);
    	root.left=new TreeNode(5);
    	root.left.left=new TreeNode(3);
    	root.right=new TreeNode(20);
    	root.right.left=new TreeNode(18);
    	root.right.left.left=new TreeNode(16);
    	root.right.right=new TreeNode(80);
    	int x=16;
        System.out.print(searchInBST(root,x));   
    }
}