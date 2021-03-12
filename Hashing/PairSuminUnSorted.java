import java.util.*;
class PairSuminUnSorted
{
    static boolean findPair(int[] arr,int sum)
    {
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0;i<arr.length;i++)
        {
            int Fe = sum - arr[i];
            if(set.contains(Fe))
            {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] arr = {11,5,8};
        int sum = 10;
        System.out.print(findPair(arr,sum));    
    }
}