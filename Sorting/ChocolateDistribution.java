import java.util.Arrays;

class ChcolateDistribution {

    static int minDiff(int[] arr, int m)
    {
        if(arr.length < m ) return -1;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0; (i+m-1) < arr.length; i++) {
            min = Math.min(min,(arr[i+m-1]- arr[i]));
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {7,3,2,4,9,12,56};
        int m = 3;
        System.out.print(minDiff(arr,m));
    }
}