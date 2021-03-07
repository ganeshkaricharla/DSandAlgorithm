class StockBuySell
{
    static int stockBuySell(int[] arr)
    {
        int profit  = 0;
        for(int i = 1; i < arr.length; i = i + 1)
        {
            if(arr[i]>arr[i-1])
            {
                profit = profit +(arr[i] - arr[i-1]);
            }
        }
        return profit;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,5,3,8,12};
        System.out.print(stockBuySell(arr));    
    }
}