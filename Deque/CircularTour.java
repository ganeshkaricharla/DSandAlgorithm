class CircularTour
{
    static int firstPetrolPump(int[] fuel,int[] dist)
    {
        int start = 0;
        curr_fuel = 0;
        int prev_fuel = 0;
        for(int i = 0;i<n;i++)
        {
            curr_pet = curr_pet + (fuel[i] - dist[i]);
            if(curr_fuel < 0)
            {
                start = i+1;
                prev_fuel = prev_fuel + curr_fuel;
                curr_fuel = 0;
            }
        }
        return ((curr_fuel+ prev_fuel)>=0)?(start+1):-1;
    }
    public static void main(String[] args) {
        int[] fuel = {50,10,60,100};
        int[] dist = {30,20,100,10};
        System.out.print(firstPetrolPump(fuel,dist));
    }

}