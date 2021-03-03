//https://www.geeksforgeeks.org/find-the-missing-number/

class FindMissingNumber
{
    static int findMissing(int[] arr)
    {
        int res = 0;
        for(int i = 0; i <= arr.length+1; i = i + 1)
        {
            res = res ^ i;
        }
        for(int i : arr)
        {
            res = res ^ i;
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] arr ={1,2,3,5};
        System.out.print(findMissing(arr));   
    }
}