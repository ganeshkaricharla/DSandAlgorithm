import java.util.*;

class CheckAnagarams
{
    static boolean checkAnagrams(String str1,String str2)
    {
        if(str1.length() != str2.length())
            return false;

        int[] ch = new int[256];
        Arrays.fill(ch,0);
        for(int i = 0;i < str1.length(); i++)
        {
            ch[str1.charAt(i)]++;
            ch[str2.charAt(i)]--;
        }
        for(int i =0;i<ch.length;i++)
        {
            if(ch[i] != 0)
            {
                return false;
            }
        }
        return true;      
    }
    public static void main(String[] args)
    {
        String str1 = "aabbdd";
        String str2 = "abdabd";
        System.out.print(checkAnagrams(str1,str2));
    }
}