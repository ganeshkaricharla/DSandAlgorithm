class Permutations
{
    static void swap(char[]arr,int i ,int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void permutation(char[] arr,int i)
    {
        if(i == arr.length -1)
        {
            System.out.println(arr);
        }

        for(int j = i; j < arr.length; j = j + 1)
        {
            swap(arr,i,j);
            permutation(arr,i+1);
            swap(arr,i,j);
        }
    }
    public static void main(String[] args)
    {
        char[] arr = {'A','B','C'};
        final int i = 0;
        permutation(arr,i);    
    }
}