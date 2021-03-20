class InsertInBST
{
    static TreeNode insertInBST(TreeNode root,int val)
    {
        TreeNode temp = new TreeNode(val);
        TreeNode parent = null;
        TreeNode curr = root;

        while(curr != null)
        {
            parent = curr;

            if(val > curr.val)
            {
                curr = curr.right;
            }
            else if(val < curr.val)
            {
                curr = curr.left;
            }
            else
            {
                return root;
            }
        }

        if(parent == null)
        {
            return temp;
        }
        else if(val > parent.val)
        {
            parent.right = temp;
        }
        else
        {
            parent.left = temp;
        }

        return root;
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
    	int x=8;
        System.out.print(insertInBST(root,x));   
    }
}