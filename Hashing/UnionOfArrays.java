import java.util.*;
class UnionOfArrays
{
    static void printUnion(int[] arr1 ,int[] arr2)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < arr1.length; i++)
        {
            set.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++)
        {
            set.add(arr2[i]);
        }

        for(int i : set)
        {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr1 = {1,3,5,7,9,11,13};
        int[] arr2 = {2,4,6,8,10,12,13,13,13};
        printUnion(arr1,arr2);
    }
}