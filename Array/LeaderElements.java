class LeaderElements
{
    static void printLeaders(int[] arr)
    {
        int currLeader = arr[arr.length-1];
        System.out.print(currLeader + " ");
        for(int i = arr.length - 2; i >=0; i = i - 1 )
        {
            if(arr[i] > currLeader)
            {
                currLeader = arr[i];
                System.out.print(currLeader + " ");
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {7,10,4,10,6,5,2};
        printLeaders(arr);    
    }
}