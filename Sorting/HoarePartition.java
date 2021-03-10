class HoarePartition {
    static void swap(int[] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int hoarePartition(int[] arr)
    {
        int low = 0;
        int high = arr.length -1;
        int i = low -1;
        int j = high + 1;
        int pivot = arr[0];
        while(true) {
            do {
                i += 1;
            } while(arr[i]< pivot);
            do {
                j -= 1;
            }while(arr[j] > pivot);
            if(i >= j) return j;
            swap(arr,j,i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,3,8,4,2,7,1,10};
        System.out.println(hoarePartition(arr));
        for(int i : arr) System.out.print(i + " ");
    }
}