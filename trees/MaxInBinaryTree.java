class MaxinBinaryTree
{
    static int maxInBinaryTree(TreeNode root)
    {
        if(root == null) return Integer.MIN_VALUE;

        return  Math.max(root.val,Math.max(maxInBinaryTree(root.left),maxInBinaryTree(root.right)));
    }
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(50);
        
        System.out.print(maxInBinaryTree(root));
    }
}