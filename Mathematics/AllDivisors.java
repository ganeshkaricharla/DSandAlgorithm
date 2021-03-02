class AllDivisors
{
    static void allDivisors(int n)
    {   
        int i;
        for(i = 1; i*i < n; i = i + 1)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        for(; i >0 ; i = i - 1)
        {
            if(n % i == 0)
            {
                System.out.print((n/i) + " ");
            }
        }
    }
    public static void main(String[] args)
    {
        int n = 15; 
        allDivisors(n);   
    }
}