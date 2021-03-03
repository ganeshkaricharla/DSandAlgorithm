class PowerSet
{
    static void powerSet(String str)
    {
        int n = str.length();
        int npower = (int)Math.pow(2,n);
        for(int i = 0 ; i < npower; i = i + 1)
        {
            for(int j = 0; j < n; j = j  + 1)
            {
                if( ( i & ( 1 << j ) ) != 0)
                {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        String str = "abc";
        powerSet(str);
    }
}