import java.util.*;
class KSortedArray
{
    static void kSortedArray(int[] arr,int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i<=k;i++)
        {
            pq.add(arr[i]);
        }
        int index = 0;
        for(int i = k+1; i < arr.length;i++)
        {
            arr[index] = pq.poll();
            index++;
            pq.add(arr[i]);
        }

        while(!pq.isEmpty())
        {
            arr[index] = pq.poll();
            index++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,19,18};
        int k = 2;
        kSortedArray(arr,k);

        for(int i :arr)
        {
            System.out.print(i + " ");
        }
    }
}