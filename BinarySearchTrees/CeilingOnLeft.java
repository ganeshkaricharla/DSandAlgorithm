import java.util.*;
class CeilingOnLeft
{
    static void printLeftCeil(int[] arr)
    {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(arr[0]);
        System.out.print("-1 ");
        for(int i = 0;i < arr.length;i++)
        {
            if(set.ceiling(arr[i])!= null)
            {
                System.out.print(set.ceiling(arr[i])+ " ");
            }
            else
            {
                System.out.print("-1 ");
            }
            set.add(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        int[] arr  = {2,8,30,15,25,12};
        printLeftCeil(arr);
    }
}