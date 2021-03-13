class NaivePatternSearch
{
    static void printMatchedIndex(String str,String pat)
    {
        for(int i =0 ;i <= (str.length() - pat.length()); i++)
        {
            int j;
            for(j = 0;j < pat.length();j++)
            {
                if(str.charAt(i+j) != pat.charAt(j)) break;
            }
            if(j == pat.length()) System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        String str = "abcabcd";
        String pat ="abcd";
        printMatchedIndex(str,pat);
    }
}