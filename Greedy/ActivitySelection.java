import  java.util.*;
class Activity
{
    int start;
    int end;
    Activity(int s,int e)
    {
        start = s;
        end = e;
    }
}
class MyCmp implements Comparator<Activity>
{
	public int compare(Activity a1, Activity a2)
	{
		return a1.finish - a2.finish;
	}
}
class ActivitySelection
{
    static int maxTasks(Activity[] arr)
    {
        Arrays.sort(arr,new MyCmp());
        int res = 1;
        int prev = 0;
        for(int curr = 1; curr<arr.length;i++)
        {
            if(arr[curr].start >= arr[prev].end)
            {
                res++;
                prev = curr;
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        Activity[] arr = {new Activity(1,3),new Activity(2,5),new Activity(3,4),new Activity(6,8),new Activity(9,12)};    
        System.out.print(maxTasks(arr));
    }
}