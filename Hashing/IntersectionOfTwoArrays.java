import java.util.*;
class IntersectionOfTwoArrays
{
    static int printIntersection(int[] arr1,int[] arr2)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i < arr1.length; i++)
        {
            set.add(arr1[i]);
        }
        int res = 0;
        for(int i = 0;i<arr2.length;i++)
        {
            if(set.contains(arr2[i]))
            {
                System.out.print(arr2[i] + " ");
                res++;
                set.remove(arr2[i]);
            }
        }
    return res;
    }
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,4,6,8,10,12};
        System.out.println(printIntersection(arr1,arr2)); 
    }
}