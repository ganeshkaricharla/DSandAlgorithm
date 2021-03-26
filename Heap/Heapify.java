class Heapify
{
    static void minHeapify(int[] arr,int i,int size)
    {
        int left = 2*i + 1;
        int right = 2*i + 2;
        int smallest = i;
        if(left < size && arr[left] < arr[smallest])
        {
            smallest = left;
        }
        if(right <size && arr[right] < arr[smallest])
        {
            smallest = right;
        }

        if(smallest != i)
        {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            minHeapify(arr,smallest,size);
        }

         
    }
    public static void main(String[] args) {
        int[] minHeap = {40,20,30,35,25,80,32,100,70,60};
        final int i = 0;
        int size = 10;
        minHeapify(minHeap,i,size);

        for(int j :minHeap)
        {
            System.out.print(j + " ");
        }
    }
}