class UnionOfSortedArrays {

    static void printUnion(int[] arr1,int[] arr2) {
        int i = 0;
        int j = 0;
        while( i < arr1.length && j < arr2.length) {
            if(i > 0 && arr1[i-1] == arr1[i]) {
                i += 1;
            }
            else if(j > 0 && arr2[j-1] == arr2[j]) {
                j += 1;
            }
            else if(arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i += 1;
            }
            else if( arr1[i] > arr2[j]) {
                System.out.print(arr2[j] + " ");
                j +=1;
            }
            else if(arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i +=1;
                j +=1;
            }
        }
        while(i < arr1.length) {
            if(i > 0 && arr1[i-1] == arr1[i]) {
                i +=1;
            }
            else {
                System.out.print(arr1[i] + " ");
                i +=1;
            }
        }
        while(j < arr2.length) {
            if(j > 0 && arr2[j-1] == arr2[j]) {
                j +=1;
            }
            else {
                System.out.print(arr2[j] + " ");
                j +=1;
            }
        }

    }
    public static void main(String[] args) {
    
        int[] arr1 = {1,1,2,2,3,4,5,6,9,9};
        int[] arr2 = {1,2,3,4,7,7,8,9,10,10,11,12,13,13,13};
        printUnion(arr1,arr2);
    }
}