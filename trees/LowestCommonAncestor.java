class LowestCommonAncestor
{
    static TreeNode lowestCommonAncestor(TreeNode root,int n1,int n2)
    {
        if(root == null) return null;

        if(root.val == n1 || root.val == n2) return root;

        TreeNode l1 = lowestCommonAncestor(root.left,n1,n2);
        TreeNode l2 = lowestCommonAncestor(root.right,n1,n2);

        if(l1 != null && l2 != null)
        {
            return root;
        }

        if(l1 != null)
        {
            return l1;
        }
        else
        {
            return l2;
        }
    }
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(50);

        TreeNode a = lowestCommonAncestor(root,40,50);
        System.out.print(a.val);
        
        
    }
}