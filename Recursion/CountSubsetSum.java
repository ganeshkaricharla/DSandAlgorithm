class CountSubsetSum
{
    
    static int countSubsetSum(int[] arr, int sum,int n)
    {
        if(n == 0)
        {
            return (sum == 0 )? 1 : 0;
        }

        return countSubsetSum(arr,sum,n-1) + countSubsetSum(arr,sum-arr[n-1],n-1);
    }
    public static void main(String[] args)
    {
        int[] arr = {10,15,20};
        int sum = 25;
        int n = arr.length;

        System.out.print(countSubsetSum(arr,sum,n));
    }
}