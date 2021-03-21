class FloorOfBST
{
    static int floorOfBST(TreeNode root, int x)
    {
        TreeNode floor = null;
        while(root != null)
        {
            if(root.val == x)
            {
                return root.val;
            }
            else if(root.val > x)
            {
                root = root.left;
            }
            else
            {
                floor = root;
                root = root.right;
            }
        }
        return floor.val;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(15);
    	root.left=new TreeNode(5);
    	root.left.left=new TreeNode(3);
    	root.right=new TreeNode(20);
    	root.right.left=new TreeNode(18);
    	root.right.left.left=new TreeNode(16);
    	root.right.right=new TreeNode(80);

        int x = 4;
        System.out.print(floorOfBST(root,4));
    }
}