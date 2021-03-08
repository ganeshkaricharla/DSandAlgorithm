class BinarySearchRecursive
{
    static int binarySearch(int[] arr,int low,int high,int target)
    {
        if(low > high) return -1;
        
        int mid = low + (high - low)/2;

        if(arr[mid] == target)  return mid;
        if(target > arr[mid]) return binarySearch(arr,mid + 1,high,target);
        else return binarySearch(arr,low,mid-1,target);
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        final int low = 0;
        final int high = arr.length -1;
        System.out.print(binarySearch(arr,low,high,target));    
    }
}