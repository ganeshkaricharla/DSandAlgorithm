import java.util.*;

class KLargestElements
{
    static void kLargestElements(int[] arr,int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0; i <k; i++)
        {
            pq.offer(arr[i]);
        }
        for(int i = k;i< arr.length;i++)
        {
            if(pq.peek() > arr[i])
            {
                continue;
            }
            else
            {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        Iterator it = pq.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {5,15,10,20,8};
        int k = 2;
        kLargestElements(arr,k);    
    }
}