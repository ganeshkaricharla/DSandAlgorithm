import java.util.*;
class StockSpan
{
    static void printSpan(int[] arr)
    {
        Stack<Integer> s = new Stack<Integer>();
        s.push(0);
        System.out.print("1 ");
        for(int i = 1; i < arr.length;i++)
        {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i])
            {
                s.pop();
            }
            System.out.print((s.isEmpty())? (i + 1): (i - s.peek()) + " "); 
            s.push(i);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {60,10,20,15,35,50};
        printSpan(arr);
    }
}