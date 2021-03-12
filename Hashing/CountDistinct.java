import java.util.HashSet;
class CountDistinct
{
    static int countDistinct(int[] arr)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        //  HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        for(int i = 0; i< arr.length; i++)
        {
            set.add(arr[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4,5,5,6,6,7,7,8,9};
        System.out.print(countDistinct(arr));
    }
}