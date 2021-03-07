class MajorityElement
{
    static int majorityElement(int[] arr)
    {
        int res = 1;
        int count = 1;
        for(int i = 1; i < arr.length; i =  i + 1)
        {
            if(arr[res] == arr[i])
            {
                count += 1;
            }
            else
            {
                count -=1;
            }
            if(count == 0)
            {
               count = 1;
               res = i; 
            }
        }
        count = 0;
        for(int i = 0;i < arr.length;i = i + 1)
        {
            if(arr[i] == arr[res]) count +=1;
        }
        if(count > (arr.length/2))
        {
            return res;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr ={8,3,4,8,8};
        System.out.print(majorityElement(arr));    
    } 
}