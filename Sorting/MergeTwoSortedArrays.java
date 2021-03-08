class MergeTwoSortedArrays
{
    static int[] mergeSorted(int[] arr1,int[] arr2)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] merged = new int[arr1.length + arr2.length];
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] <= arr2[j])
            {
                merged[k] =  arr1[i];
                i +=1;
                k +=1;
            }
            else
            {
                merged[k] = arr2[j];
                j +=1;
                k +=1;
            }
        }
        while(i<arr1.length)
        {
            merged[k] = arr1[i];
            i +=1;
            k +=1;
        }
        while(j < arr2.length)
        {
            merged[k] = arr2[j];
            j +=1;
            k +=1;
        }
        return merged;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9,11};
        int[] arr2 = {2,4,6,8,10,12};
        int[] merged = mergeSorted(arr1,arr2);
        for(int i : merged) System.out.print(i + " ");
    }
}