import java.util.*;
class LevelOrderTraversalLineByLine
{
    static void levelOrderTraversalLineByLine(TreeNode root)
    {
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);

        while(!q.isEmpty())
        {
            Queue<TreeNode> temp = new LinkedList<TreeNode>();
            while(!q.isEmpty())
            {
                TreeNode curr = q.poll();
                System.out.print(curr.val + " "); 
                if(curr.left != null)
                {
                    temp.offer(curr.left);
                }
                if(curr.right != null)
                {
                    temp.offer(curr.right);
                }
            }
            q = temp;
            System.out.println();
        }
    
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(50);
        levelOrderTraversalLineByLine(root);   
    }
}