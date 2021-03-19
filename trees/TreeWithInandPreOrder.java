class TreeWithInandPreOrder
{
    int pre = 0;
    static TreeNode constructTree(int[] inorder,int[] preorder,int is,int ie)
    {
        if(is > ie) return null;

        TreeNode root = new TreeNode(preorder[pre++]);

        int in;

        for(int i = is;i <= ie;i++)
        {
            if(root.val == inorder[i])
            {
                in = i;
                break;
            }
        }
        root.left = constructTree(inorder,preorder,is,index-1);
        root.right = constructTree(inorder,preorder,index+1, ie);

        return root;
    }
    public static void main(String[] args)
    {
        int[] inorder = {20,10,40,30,50};
        int[] preorder = {10,20,30,40,50};
        constructTree(inorder,preorder,0,inorder.length -1);     
    }
}