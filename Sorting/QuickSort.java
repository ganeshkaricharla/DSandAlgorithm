class QuickSort
{
    static void swap(int[] arr,int a ,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int hoaresPartition(int[] arr,int low,int high)
    {
        int i = low -1;
        int j = high + 1;
        int pivot = arr[low];
        while(true) {
            do {
                i++;
            }while(arr[i]<pivot);

            do {
                j--;
            }while(arr[j] > pivot);
            if(i >= j) return j;
            swap(arr,i,j);
        }
    }
    static void quickSort(int[] arr,int low,int high) {
        if(low < high) {
            int p = hoaresPartition(arr,low,high);
            quickSort(arr,low,p);
            quickSort(arr,p+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,6,8,4,2,3,7,9};
        int low = 0;
        int high = arr.length -1;
        quickSort(arr,low,high);

        for(int i : arr) System.out.print(i + " ");
    }
}