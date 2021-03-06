class MaxSumSubArray
{
    static int maxSumSubarray(int[] arr)
    {
        int res = arr[0];
        int maxEnd  = arr[0];
        for(int i = 1; i <arr.length; i +=1)
        {
            maxEnd = Math.max(maxEnd + arr[i], arr[i]);
            res = Math.max(maxEnd,res);
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(maxSumSubarray(arr));
    }
}