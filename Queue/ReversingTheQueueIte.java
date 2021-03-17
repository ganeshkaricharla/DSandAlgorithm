import java.util.*;
class ReversingTheQueueIte
{
    static void reverseQueue(Queue<Integer> q)
    {
        Stack<Integer> temp = new Stack<Integer>();
        while(!q.isEmpty())
        {
            temp.push(q.poll());
        }
        while(!temp.isEmpty())
        {
            q.offer(temp.pop());

        }
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