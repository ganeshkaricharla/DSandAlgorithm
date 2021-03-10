class IntersectionOfSortedArrays
{
    static void printIntersection(int[] arr1,int[] arr2)
    {
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length)
        {
            if(i > 0 && arr1[i-1] == arr1[i])
            {
                i +=1;
            }
            if(arr1[i] > arr2[j])
            {
                j +=1;
            }
            else if(arr1[i] < arr2[j])
            {
                i +=1;
            }
            else
            {
                System.out.print(arr1[i] + " ");
                i += 1;
                j += 1;
            }
        }
    }
    public static void main(String[] args) {
       int[] arr1 = {1,2,9};
       int[] arr2 = {4,5,6};
       printIntersection(arr1,arr2); 
    }
}