class TrappingRainWater
{
    static int trappingRainWater(int[] arr)
    {
        int[] leftmax = new int[arr.length];
        int[] rightmax = new int[arr.length];

        leftmax[0] = arr[0];
        for(int i = 1; i < arr.length; i = i + 1)
        {
            leftmax[i] = Math.max(leftmax[i-1],arr[i]);
        }
        rightmax[arr.length -1 ] = arr[arr.length -1];
        for(int i = arr.length -2; i>=0; i = i - 1)
        {
            rightmax[i] = Math.max(rightmax[i+1],arr[i]);
        }

        int totalWater = 0;
        for(int i = 0; i < arr.length; i = i + 1)
        {
            totalWater = totalWater + (Math.min(leftmax[i],rightmax[i]) - arr[i]);
        }
        
        return totalWater;
    }
    public static void main(String[] args)
    {
        int[] arr = {5,0,6,0,3};
        System.out.print(trappingRainWater(arr));   
    }
}