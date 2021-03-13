class isRotation
{
    static boolean isRotation(String s1,String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }
        return ((s1+s1).indexOf(s2) >= 0);
    }
    public static void main(String[] args) {
        
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.print(isRotation(s1,s2));
    }
}