class SquareRoot
{
    static int squareRootFloor(int num)
    {
        int low = 0;
        int high = num;
        int ans = -1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            int sq = mid*mid;
            if(sq == num)
            {
                return mid;
            }
            else if(sq > num)
            {
                high = mid -1;
            }
            else
            {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int num =  20;
        System.out.print(squareRootFloor(num));  
    }
}