import java.util.*;
class PreviousGreaterElement
{
    static void prevGreaterElement(int[] arr)
    {
        Stack<Integer> s = new Stack<Integer>();
        //s.push(arr[0]);
        for(int i = 0; i< arr.length; i++)
        {
            while(!s.isEmpty() && s.peek() <= arr[i])
            {
                s.pop();
            }
            System.out.print((s.isEmpty()? -1: s.peek()) + "  ");
            s.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {60,10,50,30,20,80,40,100,180,80};
        prevGreaterElement(arr);
    }
}