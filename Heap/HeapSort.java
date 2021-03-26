class HeapSort
{
    static void maxHeapify(int[] arr, int size,int i)
    {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;
        if(left < size && arr[left] > arr[largest])
        {
            largest = left;
        }
        if(right < size && arr[right] > arr[largest])
        {
            largest = right;
        }
        if(largest != i)
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            maxHeapify(arr,size,largest);
        }
    }
    static void buildHeap(int[] arr,int size)
    {
        for(int i = (size/2)-1; i >=0;i--)
        {
            maxHeapify(arr,size,i);
        }
    }
    static void heapSort(int[] arr, int size)
    {
        buildHeap(arr,size);

        for(int i = size-1;i>0;i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeapify(arr,i,0);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,5,2,6,7,14,25,32,52,34};
        heapSort(arr, arr.length);
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}