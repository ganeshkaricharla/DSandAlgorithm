import java.util.*;
class LeftMostNonRepeating
{
    static int leftNonRepeating(String str)
    {
        int[] findex = new int[256];
        Arrays.fill(findex,-1);
        for(int i = 0;i<str.length();i++)
        {
            if(findex[str.charAt(i)] == -1)
            {
                findex[str.charAt(i)] = i;
            }
            else
            {
                findex[str.charAt(i)] = -2;
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0;i <findex.length;i++)
        {
            if(findex[i] > 0)
            {
                res = Math.min(res,findex[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "abbababccdcsgy";
        System.out.print(leftNonRepeating(str));
    }
}