class LinearSearch
{
    static int linearSearch(int[] arr,int search)
    {
        for(int i = 0; i < arr.length; i = i + 1)
        {
            if(arr[i] == search)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr  = {1,4,2,8,9,5,6};
        int search = 9;
        System.out.print(linearSearch(arr,search));
    }
}