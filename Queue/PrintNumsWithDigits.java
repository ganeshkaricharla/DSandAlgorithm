import java.util.*;
class PrintNumsWithDigits
{
    static void printNums(String[] arr,int n)
    {
        Queue<String> q  = new LinkedList<String>();

        for(int i = 0; i< arr.length;i++)
        {
            q.offer(arr[i]);
        }
        for(int i = 0;i < n;i++)
        {
            String curr = q.poll();
            System.out.print(curr + " ");
            for(int j = 0;j < arr.length;j++)
            {
                q.offer(curr + arr[j]);
            }
        }
    }
    public static void main(String[] args)
    {
        String[] arr = {"5","6","7"};
        int n = 20;
        printNums(arr,n);
    }
}