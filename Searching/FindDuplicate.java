class FindDuplicate{

    static int FindDuplicate(int[] arr){
        int slow = arr[0];
        int fast = arr[0];
        slow = arr[slow];
        fast = arr[arr[fast]];

        while(slow != fast)
        {
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        slow = arr[0];
        while(slow!=fast)
        {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,6,2};
        System.out.print(FindDuplicate(arr));    
    }
}