import java.util.*;
class NextGreaterElement
{
    static void nextGreaterElement(int[] arr)
    {
        Stack<Integer> s = new Stack<Integer>();
        s.push(arr[arr.length-1]);
        System.out.print("-1 ");
        for(int i = (arr.length-2);i>=0;i--)
        {
            while(!s.isEmpty() && s.peek() <= arr[i])
            {
                s.pop();
            }
            System.out.print((s.isEmpty()?-1:s.peek()) + " ");
            s.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,15,10,8,6,12,9,18};
        nextGreaterElement(arr);
        
    }
}