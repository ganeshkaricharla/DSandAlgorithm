import java.util.Arrays;
class MaximumPlatforms
{
    static int maxPlatforms(int[] arr,int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i =1;
        int j = 0;
        int max = 1;
        int curr = 1;
        while(i < arr.length && j < dep.length)
        {
            if(arr[i] <= dep[j]) {
                curr++;
                i++;
            }
            else
            {
                curr--;
                j++;
            }
            max = Math.max(max,curr);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {900,600,700};
        int[] dep = {1000,730,800};
        System.out.print(maxPlatforms(arr,dep));
    }
}