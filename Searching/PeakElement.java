class PeakElement
{
    static int peakElement(int[] arr)
    {
        int low = 0;
        int high = arr.length -1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if( (mid == 0) || (mid == (arr.length -1))  || ((arr[mid] >=arr[mid-1]) && (arr[mid] >= arr[mid + 1])))
            {
                return mid;
            }
            else if(arr[mid -1] > arr[mid])
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
        int[] arr = {2,5,6};
        System.out.print(peakElement(arr));    
    }
}