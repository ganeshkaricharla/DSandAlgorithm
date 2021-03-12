import java.util.*;
class ElementMoreThanNbyK
{
    static void printMoreThanNByK(int[] arr,int k)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+ 1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            if(e.getValue() > arr.length/k )
            {
                System.out.print(e.getKey() + " ");
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,10,10,20};
        int k = 3;
        printMoreThanNByK(arr,k);
    }
}