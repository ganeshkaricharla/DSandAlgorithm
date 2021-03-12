class ReverseWords
{
    static void reverse(char[] ch ,int low,int high)
    {
        while(low < high)
        {
            char temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            low++;
            high--;
        }
    }
    static void reverseWords(char[] ch)
    {
        int low = 0;
        for(int end = 0;end < ch.length; end++)
        {
            if(ch[end] ==' ')
            {
                reverse(ch,low,end-1);
                low = end + 1;
            }
        }
        reverse(ch,low,ch.length -1);
        reverse(ch,0,ch.length -1);
    }
    public static void main(String[] args) {
        String s = "i am ganesh";
        char[] ch = s.toCharArray();
        reverseWords(ch);
        System.out.print(ch);
    }
}