class TwoOddOccurances
{
    static void twoOddOccurances(int[] arr)
    {
        int xor = 0;
        int res1 = 0;
        int res2 = 0;
        
        for(int i : arr) xor = xor ^ i;

        int rightSet = xor & (xor - 1);
        for(int i : arr)
        {
            if( ( i & rightSet ) == 0)  res1 = res1 ^ i;
            else    res2 = res2 ^ i;
        }
        System.out.print(res1 + " "+ res2);
    }
    public static void main(String[] args)
    {
        int[] arr = {1,1,1,1,2,2,3,3,4,5,5,6,6,7,7,8};
        twoOddOccurances(arr);
    }
}