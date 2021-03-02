class Palindrome
{   
    static boolean palindrome(int n)
    {
        int rev = 0;
        int temp = n;
        while(n > 0)
        {
            rev = rev *10 + (n%10);
            n = n / 10;
        }
        if(rev == temp)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        int n = 2553552;
        System.out.print(palindrome(n));    
    }
}