class BinarySearch
{
    static int binarySearch(int[] arr,int target)
    {
        int low = 0;
        int high = arr.length -1;
        while(low <= high)
        {
            int mid = low + ( high- low )/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(target < arr[mid])
            {
                high = mid -1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        System.out.print(binarySearch(arr,target));    
    }
}