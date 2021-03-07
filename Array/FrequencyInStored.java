class FrequencyInStored
{
    static void printFrequency(int[] arr)
    {
        int count = 1;
        for(int i = 1; i < arr.length; i = i + 1)
        {
            if(arr[i] == arr[i-1])
            {
                count = count + 1;
            }
            else
            {
                System.out.print(arr[i-1] + "   " + count+ "\n");
                count = 1;
            }
        }
        System.out.print(arr[arr.length -1] + "   " + count+ "\n");   
    }
    public static void main(String[] args)
    {
        int[] arr = {1,1,2,2,2,2,3,3,3,3,20,20,20,36,36,42};
        printFrequency(arr);
    }
}