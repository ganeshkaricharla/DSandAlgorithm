import java.util.*;
class LongestSubArrayWithEqual01
{
    static int longestSubArray(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int prefix = 0;
        int res = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == 0) arr[i] = -1;

            prefix = prefix + arr[i];

            if(prefix == 0) res = i+1;
            if(!map.containsKey(prefix + arr.length))
            {
                map.put(prefix + arr.length,i);
            }
            if(map.containsKey(prefix))
            {
                res = Math.max(res,(i - map.get(prefix + arr.length)));
            }   
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,0,1,1,1,1,0,0};
        System.out.print(longestSubArray(arr));
    }
}