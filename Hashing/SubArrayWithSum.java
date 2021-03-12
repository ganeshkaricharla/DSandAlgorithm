import java.util.*;

class SubArrayWithSum
{
    static boolean isSubArrayWithSum(int[] arr,int sum)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        int prefix = 0;
        for(int i = 0; i<arr.length;i++)
        {
            prefix = prefix + arr[i];
            if(prefix == sum) return true;
            if(set.contains((prefix- sum))) return true;

            set.add(prefix);
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] arr = {5,6,16,8,-1,2};
        int sum  = 9;
        System.out.print(isSubArrayWithSum(arr,sum));    
    }
}