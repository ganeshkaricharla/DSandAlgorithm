import java.util.*;

class Pair
{
    TreeNode node;
    int hd;
    Pair(TreeNode n ,int h)
    {
        node = n;
        hd = h;
    }
}
class TopView
{
    static void topView(TreeNode root)
    {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair p = q.poll();
            TreeNode curr = p.node;
            int hd = p.hd;
            if(map.containsKey(hd))
            {
                continue;
            }
            else
            { 
                map.put(hd,curr.val);
            }
            if(curr.left != null)
            {
                q.add(new Pair(curr.left,hd -1));
            }
            if(curr.right != null)
            {
                q.add(new Pair(curr.right,hd+1));
            }
        }
        for(Map.Entry<Integer,Integer> sum : map.entrySet())
        {
            System.out.print(sum.getValue() + " ");
        }
    }
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);    
        root.left.left = new TreeNode(30);
        root.left.right = new TreeNode(40);
        root.right = new TreeNode(50);

        topView(root);
    }
}