class SearchInSortedRowColumnMatrix
{
    static boolean searchinMatrix(int[][] arr,int target)
    {
        int i = 0;
        int j = arr[0].length -1;
        while(j >=0 && arr[i][j] >= target )
        {
            if(arr[i][j] == target)
            {
                return true;
            }
            j--;
        }

        while(i < arr.length && arr[i][j] <= target)
        {
            if(arr[i][j] == target)
            {
                return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[][] arr = {{10,20,30,40},{15,25,35,45},{27,29,36,48},{32,33,39,50}};
        int target  = 55;
        System.out.print(searchinMatrix(arr,target));    
    }
}