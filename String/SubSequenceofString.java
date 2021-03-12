class SubSequenceofString
{
    static boolean checkSubsequence(String str1,String str2)
    {
        int i = 0;
        int j = 0;
        while(j < str2.length() && i < str1.length())
        {
            if(str1.charAt(i) == str2.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
        if(j == str2.length())
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "GaneshNaidu";
        String str2 = "naidu";
        System.out.print(checkSubsequence(str1,str2));
    }
}
