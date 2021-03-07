class SecondLargest
{
    static int secondLargestIndex(int[] arr)
    {
        int res = -1; 
        int largest = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]>arr[largest])
            {
                res = largest;
                largest = i;
            }
            else if( arr[i] == arr[largest] )
            {
                continue;
            }
            else
            {
                if(arr[res]<arr[i])
                {
                    res = i;
                }
                else
                {
                    continue;
                }
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,1,1,1,2};
        System.out.print(secondLargestIndex(arr));
    }
}