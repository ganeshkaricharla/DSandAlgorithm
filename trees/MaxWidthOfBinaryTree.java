import java.util.*;

class MaxWidthOfBinaryTree
{
    static int maxWidth(TreeNode root)
    {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        int res = 0;
        while(!q.isEmpty())
        {
            int count = q.size();
            res = Math.max(res,count);
            for(int i = 0;i < count; i++)
            {
                TreeNode curr =  q.poll();
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(50);
        System.out.print(maxWidth(root)); 
    }
}