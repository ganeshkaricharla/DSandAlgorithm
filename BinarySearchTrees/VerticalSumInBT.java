import java.util.*;
class VerticalSumInBT
{
    static void vSumR(TreeNode root,int hd,TreeMap<Integer,Integer> map)
    {
        if(root == null)
        {
            return;
        }
        vSumR(root.left,hd-1,map);

        int pSum = (map.getOrDefault(hd,0));
        map.put(hd,pSum+ root.val);
        vSumR(root.right,hd+1,map);
    }
    static void vSum(TreeNode root)
    {
        TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>();
        vSumR(root,0,map);
        for(Map.Entry sum : map.entrySet())
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

        vSum(root);
    }
}