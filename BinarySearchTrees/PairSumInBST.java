class PairSumInBST
{
    static boolean havePair(TreeNode root,int x,HashSet<Integer> s)
    {
        if(root == null) return false;

        if(havePair(root.left,x,s)) return true;

        if(s.contains(sum - root.val)) return true;
        else
        {
            s.add(root.key);
        }
        return havePair(root.right,x,s);
    }
    public static void main(String[] args)
    {
        TreeNode root=new TreeNode(15);
    	root.left=new TreeNode(5);
    	root.left.left=new TreeNode(3);
    	root.right=new TreeNode(20);
    	root.right.left=new TreeNode(18);
    	root.right.left.left=new TreeNode(16);
    	root.right.right=new TreeNode(80);  
        HashSet<Integer> s = new HashSet<>();
        System.out.print(havePair(root,18,s));
    }
}