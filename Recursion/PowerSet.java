class PowerSet
{
    static void powerSet(String str,String curr, int i)
    {
        if(i == str.length())
        {
            System.out.print(curr + "  ");
            return;
        }
        powerSet(str,curr,i + 1);
        powerSet(str,curr+str.charAt(i),i + 1);
    }
    public static void main(String[] args)
    {   
        final String curr = "";
        final int i = 0;
        String str = "ABC";
        powerSet(str,curr,i);
    }
}