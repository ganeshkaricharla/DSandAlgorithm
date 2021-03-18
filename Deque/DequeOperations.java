import java.util.*;
class DequeOperations
{
    public static void main(String[] args)
    {
        Deque<Integer> d = new LinkedList<Integer>();
        d.addFirst(10);
        d.addLast(20);
        d.addFirst(30);
        d.addLast(40);
        d.removeFirst();
        d.removeLast();
        System.out.println(d.size());
        Iterator i = d.descendingIterator();
        while(i.hasNext())
        {
            System.out.print(i.next() + " ");
        }
    }
}