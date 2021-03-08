class BubbleSort{
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void bubbleSort(int[] arr){
        for(int i = 0; i< arr.length -1; i +=1){
            boolean swapped = false;
            for(int j = 0; j<arr.length -1; j +=1){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    swapped = true;
                }
            }
            if(!swapped)    break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,3,7,6,9,8,4};
        bubbleSort(arr);
        for(int i :arr){
            System.out.print(i + "  ");
        }
    }
}