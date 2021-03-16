import java.util.*;
class LargestHistogramArea
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
    public static void main(String[] args) {
        int[] arr = {6,2,5,4,1,5,6};
        System.out.print(largestHistogramArea(arr));
    }
}