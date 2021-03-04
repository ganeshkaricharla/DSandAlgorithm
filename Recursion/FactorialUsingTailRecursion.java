class FactorialUsingTailRecursion
{
    static int factorial(int n , int k)
    {
        if(n == 1) return k;

        return factorial(n-1,n*k);
    }
    public static void main(String[] args)
    {
        final int k = 1;
        int n = 5;
        System.out.print(factorial(n,k));    
    }
}