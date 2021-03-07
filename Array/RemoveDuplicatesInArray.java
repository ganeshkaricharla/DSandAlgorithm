class RemoveDuplicatesInArray
{
    static int removeDuplicates(int[] arr)
    {
        int res = 1;
        for(int i = 1;i < arr.length; i = i + 1)
        {
            if(arr[i] != arr[res-1])
            {
                arr[res] = arr[i];
                res = res + 1;
            }
        }
       return res; 
    }
    public static void main(String[] args)
    {
        int[] arr = {10,20,20,30,30,30};    
        int res = removeDuplicates(arr);
        for(int i = 0; i<res;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}