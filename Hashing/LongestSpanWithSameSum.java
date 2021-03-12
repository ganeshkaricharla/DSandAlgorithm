import java.util.*;

class LongestSpanWithSameSum
{
    static int getCommon(int[] arr1,int[] arr2)
    {
        int[] temp = new int[arr1.length];
        for(int i =0;i <arr1.length;i++)
        {
            temp[i] = (arr1[i] - arr2[i]);
        }

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int prefix = 0;
        int res = 0;
        for(int i =0 ; i<temp.length;i++)
        {
            prefix = prefix + temp[i];
            if(prefix == 0) res = i + 1;   
            
            if(!map.containsKey(prefix+temp.length))
            {
                map.put(prefix + temp.length,i);
            }
            if(map.containsKey(prefix+temp.length))
            {
                res = Math.max(res,i - map.get(prefix + temp.length));
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] arr1 = {1,1,0,0,0,1,1};
        int[] arr2 = {0,0,1,0,0,1,0};
        System.out.print(getCommon(arr1,arr2));
    }
}