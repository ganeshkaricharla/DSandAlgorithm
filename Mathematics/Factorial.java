class Factorial
{   
    static int factorial(int n)
    {
        int fac = 1;
        for(int i = 2;i <= n ; i = i + 1)
        {
            fac = fac * (i);
        }
        return fac;
    }
    public static void main(String[] args)
    {
        int n = 5;
        System.out.print(factorial(5));    
    }
}