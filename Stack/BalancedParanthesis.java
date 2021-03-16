import java.util.*;
class BalancedParanthesis
{
    static boolean isPair(char a,char b)
    {
        if((a == '(' && b == ')') || (a== '[' && b == ']') || (a == '{' && b == '}')) return true;
        
        return false;
    }
    static boolean isBalanced(String para)
    {
        ArrayDeque<Character> stack  = new ArrayDeque<Character>();
        for(int i =0; i < para.length(); i++)
        {
            char a = para.charAt(i);
            if( a == '[' || a == '{' || a== '(')
            {
                stack.push(a);
            }
            else
            {
                if(stack.isEmpty()) return false;
                else if(!isPair(stack.peek(),a)) return false;
                else stack.pop();
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args) {
        String para = "(({}{}[]))";
        System.out.print(isBalanced(para));         
    }
}