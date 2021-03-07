class MoveAllZeroesToEnd
{
    static void swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void moveZeroes(int[] arr)
    {
        int count = 0;
        for(int i = 0; i < arr.length; i = i + 1)
        {
            if(arr[i] != 0)
            {
                swap(arr,i,count);
                count = count + 1;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,0,0,0,12,0};
        moveZeroes(arr);

        for(int i : arr)    System.out.print(i + " ");
    }
}