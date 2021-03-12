class RopeCuttingProblem
{
    static int ropeCuts(int n, int a,int b, int c)
    {
        if(n == 0) return 0;
        if(n < 0) return -1;

        int res = Math.max(ropeCuts(n-a,a,b,c),Math.max(ropeCuts(n-b,a,b,c),ropeCuts(n-c,a,b,c)));
        if(res == -1) return -1;
        
        return res + 1;
    }
    public static void main(String[] args)
    {
        int n = 23;
        int a = 11;
        int b = 2;
        int c = 1;
        System.out.print(ropeCuts(n,a,b,c));
    }
}