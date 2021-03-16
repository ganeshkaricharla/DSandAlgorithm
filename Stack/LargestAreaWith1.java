import java.util.*;
class LargestAreaWith1
{
    static int largestHistogramArea(int[] arr)
    {
        Stack<Integer> s = new Stack<Integer>();
        int res  = 0;
        for(int i = 0; i< arr.length; i++)
        {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i])
            {
                int a =s.pop();
                int curr = arr[a]*(s.isEmpty()?i:(i - s.peek()-1));
                res = Math.max(res,curr);
            }
            s.push(i);
        }
        while(!s.isEmpty())
        {
            int a= s.pop();
            int curr = arr[a]*(s.isEmpty()?arr.length:(arr.length-s.peek() -1));
            res = Math.max(res,curr);
        }
        return res;
    }
    
    static int maxSubMatrixWith1(int[][] arr)
    {
        int res = largestHistogramArea(arr[0]);
        for(int i = 1; i< arr.length;i++)
        {
            for(int j = 0;j < arr.length;j++)
            {
                if(arr[i][j] == 1)
                {
                    arr[i][j] += arr[i-1][j];
                }   
            }
            res = Math.max(res,largestHistogramArea(arr[i]));
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] arr = {{0,1,1,0},
                       {1,1,1,1},
                       {1,1,1,1},
                       {1,1,1,0}};
        System.out.print(maxSubMatrixWith1(arr));
    }
}