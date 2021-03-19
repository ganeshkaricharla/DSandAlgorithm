import java.util.*;
class TreeInSpiralForm
{
    static void printInSpiral(TreeNode root)
    {
        if(root == null) return ;

        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();

        s1.add(root);

        while(!s1.isEmpty() || !s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                TreeNode temp = s1.pop();
                System.out.print(temp.val + " ");

                if(temp.left != null)
                {
                    s2.add(temp.left);
                }
                if(temp.right != null)
                {
                    s2.add(temp.right);
                }

            }

            while(!s2.isEmpty())
            {
                TreeNode temp = s2.pop();
                System.out.print(temp.val + " ");

                if(temp.right != null)
                {
                    s1.add(temp.right);
                }
                if(temp.left != null)
                {
                    s1.add(temp.left);
                }
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

        printInSpiral(root);
    }
}