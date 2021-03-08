class SelectionSort{
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void selectionSort(int[] arr){
        for(int i = 0; i <= arr.length -1; i += 1){
            int min = i;
            for(int j = i + 1; j < arr.length; j += 1){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,6,8,9,1,4,7,3};
        selectionSort(arr);
        for(int i : arr) System.out.print(i + " ");
    }
}