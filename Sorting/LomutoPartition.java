class LomutoPartition {
    static void swap(int[] arr,int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int lomutoPartition(int[] arr)
    {
        int low = 0;
        int high = arr.length -1;
        int pivot = arr[high];
        int part = low -1;
        for(int  i = low; i <=high -1; i += 1) {
            if(arr[i] < pivot)
            {
                part = part + 1;
                swap(arr,i,part);
            }
        }
        swap(arr,part + 1, high);
        return (part + 1);
    }
    public static void main(String[] args) {
        int[] arr = {70,60,80,40,30};
        System.out.println(lomutoPartition(arr));
        for(int i : arr) System.out.print(i + " ");
    }
}