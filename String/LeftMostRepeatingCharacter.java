import java.util.*;
class LeftMostRepeatingCharacter
{
    static int leftMostRepeating(String str)
    {
        int res = -1;
        boolean[] visited = new boolean[256];

        Arrays.fill(visited,false);
        for(int i = str.length() -1 ;i >=0; i--)
        {
            if(visited[str.charAt(i)])
            {
                res = i;
            }
            else
            {
                visited[str.charAt(i)] = true;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "axbcbcd";
        System.out.print(leftMostRepeating(str));
    }
}