class MaxCircularSubArray
{
    static int maxSubArray(int[] arr)
    {
        int res = arr[0];
        int curr = arr[0];
        for(int i = 1; i< arr.length; i += 1)
        {
            curr = Math.max(arr[i],curr + arr[i]);
            res = Math.max(res,curr);
        }
        return res;
    }
    static int maxCircularSum(int[] arr)
    {
        int maxSubArraysum = maxSubArray(arr);
        if(maxSubArraysum < 0)
        {
            return maxSubArraysum;
        }
        int sum = 0;
        for(int i = 0;i <arr.length; i = i + 1)
        {
            sum = sum + arr[i];
            arr[i] = -arr[i];
        }
        int maxCir = sum + maxSubArray(arr);
        return Math.max(maxCir,maxSubArraysum);
    }
    public static void main(String[] args)
    {
        int[] arr ={8,-4,3,-5,4};
        System.out.print(maxCircularSum(arr));    
    }
}