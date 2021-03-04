class TowerOfHanoi
{
    static void towerOfHanoi(int n, char t1,char t2, char t3)
    {
        if(n == 1)
        {
            System.out.println("Move " + n + " From " + t1 + " to " + t3);
            return;
        }
        towerOfHanoi(n-1,t1,t3,t2);
        System.out.println("Move " + n + " From " + t1 + " to " + t3);
        towerOfHanoi(n-1,t2,t1,t3);
    }
    public static void main(String[] args)
    {
        int n = 4;
        char t1 = 'A';
        char t2 = 'B';
        char t3 = 'C';
        towerOfHanoi(n,t1,t2,t3);            
    }    
}