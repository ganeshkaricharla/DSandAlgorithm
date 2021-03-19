import java.util.*;
class LeftView
{
    static void leftView(TreeNode root)
    {
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);

        while(!q.isEmpty())
        {
            int s = q.size();
            for(int i = 0;i < s; i++ )
            {
                TreeNode curr = q.poll();
                if(i == 0)
                {
                    System.out.print(curr.val + " ");
                }
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
        }
    
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(50);
        leftView(root);   
    }
}