import java.util.*;

class MedianOfStream
{
    static void printMedians(int[] arr)
    {
        PriorityQueue<Integer> smaller = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> greater = new PriorityQueue<Integer>();
        
        smaller.add(arr[0]);
        System.out.print(arr[0] + " ");

        for(int i = 1;i < arr.length;i++)
        {
            int x = arr[i];
            if(smaller.size() > greater.size())
            {
                if(smaller.peek() > x)
                {
                    greater.add(smaller.poll());
                    smaller.add(x);
                }
                else
                {
                    greater.add(x);
                }
                System.out.print((smaller.peek() + greater.peek())/2 + " ");
            }
            else
            {
                if(x <= smaller.peek())
                {
                    smaller.add(x);
                }
                else
                {
                    greater.add(x);
                    smaller.add(greater.poll());    
                }
                System.out.print(smaller.peek()+ " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,15,10,5,7,16};
        printMedians(arr);
    }
}