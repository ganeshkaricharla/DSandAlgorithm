class TraillingZeroes
{   
    static int traillingZeroes(int n)
    {
        int count = 0;
        for(int i = 5;i <= n; i = i*5)
        {
            count = count + (n/i);
        }
        return count;
    }
    public static void main(String[] args)
    {
        int n = 251;
        System.out.print(traillingZeroes(n));
    }
}