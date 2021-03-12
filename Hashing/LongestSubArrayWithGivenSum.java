import java.util.*;
class LongestSubArrayWithGivenSum
{
    static int longestSubArray(int[] arr,int sum)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int prefix = 0;
        int res = 0;
        for(int i = 0;i<arr.length;i++)
        {
            prefix = prefix + arr[i];
            if(prefix == sum) res = i+1;
            if(!map.containsKey(prefix))
            {
                map.put(prefix,i);
            }
            if(map.containsKey(prefix-sum))
            {
                res = Math.max(res,i - map.get(prefix-sum));
            }   
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] arr = {8,3,1,5,6,-6,2,2};
        int sum  = 4;
        System.out.print(longestSubArray(arr,sum));  
    }
}