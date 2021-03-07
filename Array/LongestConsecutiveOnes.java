class LongestConsecutiveOnes
{
    static int longestConsecutiveOnes(int[] arr)
    {
        int max = 0;
        int curr = 0;
        for(int i = 0; i < arr.length; i = i + 1)
        {
            if(arr[i] == 0)
            {
                curr = 0;
            }
            else
            {
                curr = curr + 1;
                max = Math.max(curr,max);
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        int[] arr = {0,0,1,1,1,1,0,1,1,1,1,1};
        System.out.print(longestConsecutiveOnes(arr)); 
    }
}