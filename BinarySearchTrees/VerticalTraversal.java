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
class VerticalTraversal
{
    static void vTraversal(TreeNode root)
    {
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair p = q.poll();
            TreeNode curr = p.node;
            int hd = p.hd;
            if(map.containsKey(hd))
            {
                map.get(hd).add(curr.val);
            }
            else
            {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(curr.val); 
                map.put(hd,al);
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
        for(Map.Entry<Integer,ArrayList<Integer>> sum : map.entrySet())
        {
            ArrayList<Integer> temp = sum.getValue();
            for(int x: temp)
            {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);    
        root.left.left = new TreeNode(30);
        root.left.right = new TreeNode(40);
        root.right = new TreeNode(50);

        vTraversal(root);
    }
}