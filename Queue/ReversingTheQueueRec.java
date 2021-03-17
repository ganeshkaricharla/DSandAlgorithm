import java.util.*;
class ReverseTheQueueRec
{
    static void reverseQueue(Queue<Integer> q)
    {
        if(q.isEmpty()) return ;

        int x =q.poll();
        reverseQueue(q);
        q.offer(x);
    }
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<Integer>();   
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.print(q);
        reverseQueue(q);
        System.out.print(q);
    }
}