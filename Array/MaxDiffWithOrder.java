class MaxDiffWithOrder
{
    static int maxDiff(int[] arr)
    {
        int res = arr[1] - arr[0];
        int currMin = arr[0];
        for(int i = 0;i<arr.length;i = i + 1)
        {
            res = Math.max(res,arr[i]- currMin);
            currMin = Math.min(currMin,arr[i]);
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] arr = {2,3,10,6,4,8,1};
        System.out.print(maxDiff(arr));    
    }
}