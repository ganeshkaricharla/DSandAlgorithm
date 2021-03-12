import java.util.*;

class LongestConsecutiveSunsequence
{
    static int findLongestsubsequence(int[] arr)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i<arr.length; i++)
        {
            set.add(arr[i]);
        }
        int res = 0;
        int curr = 0;
        for(int i = 0;i < arr.length;i++)
        {
            if(!set.contains(arr[i] - 1))
            {
                curr = 1;
                while(set.contains(arr[i] + curr))
                {
                    curr++;
                }
            }
            res = Math.max(res,curr);
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,5,2,3,4,8,9,10,11,13};
        System.out.print(findLongestsubsequence(arr));    
    }
}