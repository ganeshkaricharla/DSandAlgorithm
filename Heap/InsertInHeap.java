import java.util.*;

class InsertInHeap
{
    static void insertInHeap(int[] arr,int size,int val)
    {
        size++;
        arr[size - 1] = val;
        for(int i = size -1;i>0 && arr[(i-1)/2] > arr[i];)
        {
            int temp = arr[(i-1)/2];
            arr[(i-1)/2] = arr[i];
            arr[i] = temp;
            i = (i-1)/2;
        }

    }
    public static void main(String[] args)
    {
        int[] arr = {10,20,15,40,50,100,25,45,0,0,0};
        int size = 8;
        int val = 12;
        insertInHeap(arr,size,val);
        for(int i : arr)
            System.out.print(i + " ");
    }
}