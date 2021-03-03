class CountSetBK
{
    static int countSetBK(int n)
    {
        int res = 0;
        while(n > 0)
        {
            res = res + 1;
            n = n & (n - 1);
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.print(countSetBK(n));
    }
}