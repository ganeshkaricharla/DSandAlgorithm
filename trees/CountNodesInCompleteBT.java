class CountNodesInCompleteBT
{     
    public static int countNodes(TreeNode root){
        int lh=0,rh=0;
        TreeNode curr=root;
        while(curr!=null){
            lh++;
            curr=curr.left;
        }
        curr=root;
        while(curr!=null){
            rh++;
            curr=curr.right;
        }
        if(lh==rh){
            return (int)Math.pow(2,lh)-1;
        }else{
            return 1+countNodes(root.left)+countNodes(root.right);
        }
    } 
    public static void main(String args[]) 
    { 
        TreeNode root=new TreeNode(10);
    	root.left=new TreeNode(20);
    	root.right=new TreeNode(30);
    	root.right.left=new TreeNode(40);
    	root.right.right=new TreeNode(50);
    	
    	System.out.print(countNodes(root));
    } 
    
} 