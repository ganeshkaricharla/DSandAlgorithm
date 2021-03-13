class RabinKarp
{
    static final int d = 256;
    static final int q = 101;
    static void printPattern(String str,String pat)
    {
        int m = str.length();
        int n = pat.length();
        int h = 1;
        for(int i = 0;i<=n-1;i++)
        {
            h = (h*d)%q;
        }

        int p = 0;
        int t = 0;
        for(int i = 0;i < n;i++)
        {
            p = (p*d + pat.charAt(i))%q;
            t = (t*d + str.charAt(i))%q;
        }

        for(int i =0; i <=(m - n);i++)
        {
            if(p == t)
            {
                boolean flag = true;
                for(int j = 0;j < n; j++)
                {
                    if(str.charAt(i+j) != pat.charAt(j))
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag == true)
                {
                    System.out.print(i + " ");
                }
            }
            if(i < (m-n))
            {
                t = ((d*(t - str.charAt(i)*h))+str.charAt(i + n))%q;
                if(t < 0)
                {
                    t = t + q;
                }
            }
        }

    }
    public static void main(String[] args)
    {
        String str = "abcabcdabbcbabcdd";
        String pat = "abcd";
        printPattern(str,pat);
    }
}