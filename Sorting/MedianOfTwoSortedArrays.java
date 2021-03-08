class MedianOfTwoSortedArray
{
    static double medianOfSortedArray(int[] arr1, int[] arr2)
    {
        int low1 = 0;
        int high1 = arr1.length -1;
        int n1 = arr1.length;
        int n2 = arr2.length;
        while(low1 <= high1)
        {
            int mid1 = low1 + (high1 - low1)/2;
            int mid2 = ((n1+n2+1)/2) - mid1;

            int min1 = (mid1 == n1)?Integer.MAX_VALUE:arr1[mid1];
            int max1 = (mid1 == 0)? Integer.MIN_VALUE:arr1[mid1-1];

            int min2 = (mid2 == n2)?Integer.MAX_VALUE:arr2[mid2];
            int max2 = (mid2 == 0 )?Integer.MIN_VALUE:arr2[mid2-1]
            if(max1 <= min2 && max2 <= min1)
            {
                if( (n1 + n2)%2 == 0)
                {
                    return (double)((Math.max(max1,max2) + Math.min(min1,min2))/2)
                }
                else
                {
                    return (double)(Math.max(max1,max));
                }
            }
            else if(max1 > min2){
                high1 = mid1 - 1;
            }
            else{
                low1 = mid1 + 1;
            }
        }
    }
    public static void main(String[] args) {
       
        int[] arr1 = {1,3,5,7,9,11};
        int[] arr2 = {2,4,6,8,10,12,14};
        System.out.print(medianOfSortedArray(arr1,arr2));
    }
}