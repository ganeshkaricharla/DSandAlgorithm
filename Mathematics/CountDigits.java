class CountDigits
{   
    static int countDigits(int n)
    {
        int count = 0;
        while(n>0)
        {
            n = n /10;
            count = count + 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 1256;
        System.out.print(countDigits(n));
    }
}