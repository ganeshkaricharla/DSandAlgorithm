import java.util.*;
class HasAnagram
{
    static boolean areSame(int Char_s[],int Char_p[]){
        for(int i=0;i<256;i++)
        {
            if(Char_s[i]!=Char_p[i]) return false;
        }
        return true;
    }
    static boolean hasAnagram(String s,String p)
    {
        int[] Char_s = new int[256];
        int[] Char_p = new int[256];
        Arrays.fill(Char_p,0);
        Arrays.fill(Char_s,0);
        for(int i = 0;i < p.length(); i++)
        {
            Char_p[p.charAt(i)]++;
            Char_s[s.charAt(i)]++;
        }

        for(int i = p.length();i<s.length();i++)
        {
            if(areSame(Char_p,Char_s))
            {
                return true;
            }
            Char_s[s.charAt(i)]++;
            Char_s[s.charAt(i - p.length())]--;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "ganeshK";
        String p = "nag";
        System.out.print(hasAnagram(s,p));
    }
}