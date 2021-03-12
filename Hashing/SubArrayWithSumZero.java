import java.util.*;

class SubArrayWithSumZero
{
    static boolean isSubArrayPresent(int[] arr)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        int preSum = 0;
        for(int i = 0; i <arr.length;i++)
        {
            preSum = preSum + arr[i];
            if(set.contains(preSum))
            {
                return true;
            }
            if(preSum == 0)
            {
                return true;
            }
            set.add(preSum);
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] arr = {3,4,3,-1,1};
        System.out.print(isSubArrayPresent(arr));    
    }
}