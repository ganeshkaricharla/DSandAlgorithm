import java.util.*;
class BuyMaximumWithSum
{
    static int maxItems(int[] arr,int sum)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr)
        {
            pq.offer(i);
        }
        int res = 0;
        while(pq.peek() <= sum)
        {
            sum -= pq.poll();
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {20,10,5,30,100};
        int sum = 35;
        System.out.print(maxItems(arr,sum));
    }
}