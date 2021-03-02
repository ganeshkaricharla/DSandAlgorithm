class GCD
{
    static int gcd(int a,int b)
    {
        if(b == 0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.print(gcd(a,b));
    }
}