class FirstOccuranceRecursion
{
    static int firstOccurance(int[] arr,int low,int high,int target)
    {
        if(low > high)
        {
            return -1;
        }
        int mid = low + (high - low) /2;
        if(target < arr[mid])
        {
            return firstOccurance(arr,low,mid-1,target);
        }
        else if(target > arr[mid])
        {
            return firstOccurance(arr,mid + 1,high,target);
        }
        else
        {
            if(mid == 0 || arr[mid-1] != arr[mid])  return mid;

            return firstOccurance(arr,low,mid-1,target);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1,1,2,2,2,3,3,4,4,4};
        int target  = 2;
        final int low = 0;
        final int high = arr.length -1;
        System.out.print(firstOccurance(arr,low,high,target));
    }
}