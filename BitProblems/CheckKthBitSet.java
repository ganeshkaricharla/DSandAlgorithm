class CheckKthBitSet
{
    static boolean checkSetBit(int n , int k)
    {
        if( ( n & (1 << ( k-1 ) ) ) != 0 ) return true;
        else    return false;
    }
    public static void main(String[] args)
    {        
        int n = 5;
        int k = 3;
        System.out.print(checkSetBit(n,k));
    }
}