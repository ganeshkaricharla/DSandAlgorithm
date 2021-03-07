class LeftRotateByK
{
    static void swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void rotateArray(int[] arr,int left,int right)
    {
        while(left < right)
        {
            swap(arr,left,right);
            left = left + 1;
            right = right - 1;
        }
    }
    static void leftRotateByK(int[] arr,int k)
    {
        rotateArray(arr,0,k-1);
        rotateArray(arr,k,arr.length -1);
        rotateArray(arr,0,arr.length -1);
    }
    public static void main(String[] artgs)
    {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        leftRotateByK(arr,k);
        for(int i : arr)    System.out.print(i + " ");   
    }
}