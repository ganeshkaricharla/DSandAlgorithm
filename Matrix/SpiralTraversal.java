class SpiralTraversal
{
    static void printSpiral(int[][] arr)
    {
        int top = 0;
        int left = 0;
        int right = arr[0].length-1;
        int bottom = arr.length-1;

        while(top <= bottom && left <= right)
        {
            for(int i = left; i <=right; i++)
            {
                System.out.print(arr[top][i] + " ");
            }
            top++; 
            for(int i = top; i <= bottom; i++)
            {
                System.out.print(arr[i][right]  + " ");
            }
            right--;
            if(left <= right)
            {
                for(int i = right;i >= left;i--)
                {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }
            if(top <= bottom)
            {
                for(int i =bottom;i>=top;i--)
                {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        //1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
        printSpiral(arr);
    }
}