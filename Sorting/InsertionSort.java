class InsertionSort{
    static void insertionSort(int[] arr){

        for(int i =1 ; i < arr.length -1; i +=1){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]> key){
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,3,1,4,8,9,7};
        insertionSort(arr);
        for(int i :arr) System.out.print(i + " ");
    }
}