import java.util.*;
class FrequencyOfElements
{
    static void printFrequency(int[] arr)
    {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i<arr.length; i++)
        {
            map.put(arr[i],map.getorDefault(x,0)+1);   
        }
        for(Map.Entry<Integer,Integer>  e = map.entrySet())
        {
            System.out.println("-->" + e.getKey() + " = " + e.getValue());
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        printFrequency(arr);   
    }
}