class ChildrenSumProperty
{
    static boolean checkProperty(TreeNode root)
    {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        
        int sum = 0;
        if(root.left != null) sum += root.left.val;
        if(root.right != null) sum += root.left.val;

        return ((root.val == sum) && checkProperty(root.left) && checkProperty(root.right));
    }
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(50);

        System.out.print(checkProperty(root));
        
        
    }
}