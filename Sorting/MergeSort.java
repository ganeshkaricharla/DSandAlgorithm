class MergeSort {
    static void merge(int[] arr,int low,int mid ,int high)
    {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i = 0; i<n1; i +=1)
        {
            left[i] = arr[low + i];
        }
        for(int i = 0; i<n2; i +=1)
        {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = low;
        while(i < n1 && j < n2)
        {
            if(left[i] <= right[j])
            {
                arr[k] = left[i];
                i +=1;
                k +=1;
            }
            else
            {
                arr[k] = right[j];
                j +=1;
                k +=1;
            }
        }
        while( i < n1)
        {
            arr[k] = left[i];
            k +=1;
            i +=1;
        }
        while( j < right.length)
        {
            arr[k] = right[j];
            k +=1;
            j +=1;
        }
    }
    static void mergeSort(int[] arr,int low,int high)
    {
        if(high > low)
        {
            int mid = low + (high - low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid + 1, high);
            merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,8};
        final int low = 0;
        final int high = arr.length -1;
        mergeSort(arr,low,high);
        for(int i : arr) System.out.print(i + " ");
    }
}