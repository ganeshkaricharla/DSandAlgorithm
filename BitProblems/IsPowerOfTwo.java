class IsPowerOfTwo
{
    static boolean isPowerOfTwo(int n)
    {
        if(n==0)
        {
            return false;
        }

        return ((n & (n-1)) == 0);
    }
    public static void main(String[] args)
    {
        int n = 17;
        System.out.print(isPowerOfTwo(n));
    }
}