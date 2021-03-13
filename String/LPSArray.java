class LPSArray
{
    static void lpsArray(String str, int[] lps)
    {
        lps[0] = 0;
        int i = 1;
        int len  = 0;
        while(i < str.length())
        {
            if(str.charAt(len) == str.charAt(i))
            {
                len++;
                lps[i] = len;
                i++;
            } 
            else
            {
                if(len == 0)
                {
                    lps[i] = 0;
                    i++;
                }
                else
                {
                    len = lps[len -1];
                }
            }
        }
    }
    public static void main(String[] args) {
        String str = "aaabaaac";
        int[] lps = new int[str.length()];
        lpsArray(str,lps);
        for(int i : lps)
        {
            System.out.print(i + " ");
        }
    }
}