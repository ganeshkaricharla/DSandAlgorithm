class IsSortedArray
{
    static boolean isSortedArray(int[] arr)
    {
        for(int i = 1; i <arr.length; i = i + 1)
        {
            if(arr[i-1] > arr[i])   return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,35,6,7,8};
        System.out.print(isSortedArray(arr));    
    }
}