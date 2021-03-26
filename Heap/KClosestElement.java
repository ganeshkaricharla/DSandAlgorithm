import java.util.*;
class Pair 
{ 
    Integer key; 
    Integer value; 
      
    public Pair(Integer key, Integer value) 
    { 
        this.key = key; 
        this.value = value; 
    } 
    public Integer getKey() 
    { 
        return key; 
    } 
    public void setKey(Integer key) 
    { 
        this.key = key; 
    } 
    public Integer getValue() 
    { 
        return value; 
    } 
    public void setValue(Integer value) 
    { 
        this.value = value; 
    } 
} 
class KClosestElement
{
    public static void printKClosest(int[] arr,int k, int x)
    {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>()
        {
            public int compare(Pair p1,Pair p2)
            {
                return p2.getValue().compareTo(p1.getValue());
            }
        });

        for(int i = 0; i< k; i++)
        {
            pq.offer(new Pair(arr[i],Math.abs(x- arr[i])));
        }

        for(int i = k; i< arr.length; i++)
        {
            int diff = Math.abs(x - arr[i]);
            if((pq.peek().getValue())>diff)
            {
                pq.poll();
                pq.offer(new Pair(arr[i],diff));
            }
        }

        while(!pq.isEmpty())
        {
            System.out.print(pq.poll().getKey() + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {30,40,32,33,36,37};
        int k = 3;
        int x = 32;
        printKClosest(arr,k,x);
    }    
}