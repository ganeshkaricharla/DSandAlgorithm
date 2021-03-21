class DeleteInBST
{
    TreeNode getSuccessor(TreeNode root)
    {
        TreeNode curr = root.right;
        while(curr != null || curr.left != null)
        {
            curr = curr.left;
        }
        return curr;
    }
    static TreeNode deleteInBST(TreeNode root,int x)
    {
         if(root == null)
         {
             return null;
         }
         if(x > root.val)
         {
            root.right = deleteInBST(root.right,x);
         }
         else if( x < root.val)
         {
             root.left = deleteInBST(root.left, x);
         }
         else
         {
            if(root.left == null) return root.right;
            else if(root.right == null ) return root.left;
            else
            {
                TreeNode succ = getSuccessor(root);
                root.key = succ.key;
                root.right = deleteInBST(root.right,succ.key); 
            }
         }
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
        int x = 20;
        deleteInBST(root,x);   
    }
}