class FirstOccuranceIterative
{
    static int firstOccuranceIterative(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length -1;

        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(target > arr[mid])
            {
                high = mid - 1;
            }
            else if(target < arr[mid])
            {
                low = mid + 1;
            }
            else
            {
                if(mid == 0 || arr[mid-1] != arr[mid]) return mid;

                high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,1,2,2,2,2,3,3,3,3,3};
        int target = 2;
        System.out.print(firstOccuranceIterative(arr,target));    
    }
}