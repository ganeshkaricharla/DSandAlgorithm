class PrintNumbersBothWays
{
    static void printNToOne(int n)
    {
        if(n == 0) return;

        System.out.print(n + " ");
        printNToOne(n-1);
    }
    static void printOneToN(int n)
    {
        if(n == 0) return;

        printOneToN(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args)
    {
        int n = 10;
        printNToOne(n);
        System.out.println();
        printOneToN(n);
    }
}