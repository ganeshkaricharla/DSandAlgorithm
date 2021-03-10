class KthSmallestElement
{
    static void swap(int[] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int partition(int[] arr,int low,int high)
    {
        int pivot = arr[high];
        int i = low -1;
        for(int j = 0; j < high; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                swap(arr,i,j);
            }   
        }
        swap(arr,high,i+1);
        return i+1;
    }
    static int kthSmallestElement(int[] arr, int k)
    {
        int low = 0;
        int high = arr.length -1;
        while(low < high)
        {
            int p = partition(arr,low,high);
            if(p ==(k-1)) {
                return arr[p];
            }
            else if(p > (k-1)) {
                high = p -1;
            }
            else {
                low = p + 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,9,7,3};
        int k = 2;
        System.out.print(kthSmallestElement(arr,k));
    }
}