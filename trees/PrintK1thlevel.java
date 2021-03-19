class PrintK1thLevel
{
    static void printK1thLevel(TreeNode root,int k)
    {
        if(root == null) return;
        if(k == 0) System.out.print(root.val + " ");

        printK1thLevel(root.left,k-1);
        printK1thLevel(root.right,k-1);

    }
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right = new TreeNode(30);
        root.right.right = new TreeNode(70);
        root.right.right.right = new TreeNode(80); 
        int k = 2;
        printK1thLevel(root,k);
    }
}