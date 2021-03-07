class ReverseArray
{
    static void swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void reverseArray(int[] arr)
    {
        int left = 0;
        int right = arr.length -1;

        while(left < right)
        {
            swap(arr,left,right);
            left = left + 1;
            right = right - 1;
        }
    }
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7};
        reverseArray(arr);

        for(int i :arr)
        {
            System.out.print(i + " ");
        }
    }
}