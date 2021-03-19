class ConvertBinaryTreeIntioDLL
{
    TreeNode prev = null;
    static TreeNode convertIntoDLL(TreeNode root)
    {
        IF(root == null) return root;
        Node head = convertIntoDLL(root.left);

        if(prev == null) { head = root};
        else
        {
            root.left = prev;
            prev.right = root;
        }
        prev = root;

        convertIntoDLL(root.right);

        return head;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(40);    
        root.right.right = new TreeNode(50);

        convertIntoDLL(root);
    }
}