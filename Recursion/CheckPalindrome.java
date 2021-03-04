class CheckPalindrome
{
    static boolean checkPalindrome(String str,int start,int end)
    {
        if(start >= end) return true;

        return (str.charAt(start) == str.charAt(end)) && checkPalindrome(str,start + 1, end - 1);

    }
    public static void main(String[] args)
    {
        String str = "abcba";
        System.out.print(checkPalindrome(str,0,str.length()-1));
    }
}