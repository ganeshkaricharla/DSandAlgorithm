class SizeOfBinaryTree
{
    static int sizeOfBinaryTree(TreeNode root)
    {
        if(root == null) return 0;

        return  1 + sizeOfBinaryTree(root.left) + sizeOfBinaryTree(root.right);
    }
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(50);
        
        System.out.print(sizeOfBinaryTree(root));
    }
}