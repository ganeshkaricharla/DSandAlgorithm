import java.util.*;
class MaxofAllSubArray
{
    static void printAllMax(int[] arr,int k)
    {
        Deque<Integer> dq = new LinkedList<Integer>();
        for(int i = 0;i<k;i++)
        {
           while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
           {
               dq.removeLast();
           } 
           dq.addLast(i);
        }
        for(int i = k;i < arr.length;i++)
        {
            System.out.print(arr[dq.peekFirst()] + " ");
            while ((!dq.isEmpty()) && dq.peek() <= i - k)
                dq.removeFirst();  
            while ((!dq.isEmpty()) && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();
            
                dq.addLast(i);
        }
        System.out.print(arr[dq.peekFirst()] + " ");
    }
    public static void main(String[] args)
    {
        int[] arr = {10,8,5,12,14,16,18,20,25};
        int k = 3;
        printAllMax(arr,k);    
    }
}