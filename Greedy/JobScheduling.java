import java.util.*;
class Job
{
    char id;
    int deadline;
    int profit;
    Job(char j,int d,int p)
    {
        id = j;
        deadline = d;
        profit = p;
    }
}
class MyCmp implements Comparator<Job>
{
    public int compare(Job a,Job b)
    {
        return b.profit - a.profit;
    }
}
class JobScheduling
{
    static void printJobSequence(Job[] arr,int max)
    {
        Arrays.sort(arr,new MyCmp());
        int profit = 0;
        boolean[] isSlotFilled = new boolean[max];
        for(int i = 0;i< arr.length;i++)
        {
            int slot  = arr[i].deadline -1;
            if(isSlotFilled[slot] == false)
            {
                isSlotFilled[slot] = true;
                System.out.print(arr[i].id + " ");
                profit = profit + arr[i].profit;
            }
        }
        System.out.print("Max Profit Obtained = " + profit);

    }
    public static void main(String[] args) {
        Job[] arr = {new Job('a',2,100),
                     new Job('b',1,50),
                     new Job('c',2,10),
                     new Job('d',1,20),
                     new Job('e',3,30)};
        int max = 3;
        printJobSequence(arr,3);
    }
}