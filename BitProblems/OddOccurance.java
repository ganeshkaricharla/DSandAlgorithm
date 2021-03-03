class OddOccurance
{
    static int oddOccurance(int[] arr)
    {
        int res = 0;
        for(int i: arr)
        {
            res = res ^ i;
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,1,1,1,2,3,3};
        System.out.print(oddOccurance(arr));    
    }
}