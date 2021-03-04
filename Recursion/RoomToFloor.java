import java.util.Scanner;
class RoomToFloor
{
    static void helpdel(int[] shopsonfloor,int[] delroom)
    {
        for(int product : delroom)
        {
            int floor = 0;
            int room = 0;
            int sum = 0;
            for(int i = 0; i < shopsonfloor.length; i = i + 1)
            {
                sum = sum + shopsonfloor[i];
                if(product <= sum)
                {
                    floor = i + 1;
                    int sumroom = sum - shopsonfloor[i];
                    room = product - sumroom; 
                    break;
                }
            }
            System.out.print(floor+ " " + room + "\n");
        }
        
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int floor = s.nextInt();
        int del = s.nextInt();
        int[] shopsonfloor = new int[floor];
        int[] delroom = new int[del];

        for(int i = 0; i < floor; i = i + 1)
        {
            shopsonfloor[i] = s.nextInt();
        } 
        for(int i = 0; i < del; i = i + 1)
        {
            delroom[i] = s.nextInt();
        }
        
        helpdel(shopsonfloor,delroom);
    }
}