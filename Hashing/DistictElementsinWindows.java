import java.util.*;


class DistinctElementsWindows
{
    static void printFrequency(int[] arr,int k)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i <k;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        System.out.print(map.size() + " ");

        for(int i = k;i<arr.length;i++)
        {
            map.put(arr[i-k],map.get(arr[i-k]) - 1);
            
            if(map.get(arr[i-k]) == 0)
            {
                map.remove(arr[i-k]);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            System.out.print(map.size() + " ");
        }

    }
    public static void main(String[] args) {
        
        int[] arr = {10,20,10,10,30,40};
        int k = 4;
        printFrequency(arr,k);
    }
}