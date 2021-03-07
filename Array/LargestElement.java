class LargestElement
{
    static int largestElementIndex(int[] arr)
    {
        int res = 1;
        for(int i = 1 ; i < arr.length; i= i + 1)
        {
            if(arr[i] > arr[res])
            {
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,9,7};
        System.out.print(largestElementIndex(arr));    
    }
}