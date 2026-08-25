import java.util.*;
public class infixtopre {
    public static int getpriority(char a)
    {
        if(a=='^')
        {
            return 3;
        }
        if(a=='/'||a=='*'||a=='%')
        {
            return 2;
        }
        if(a=='+'||a=='-')
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expre = sc.nextLine();
        StringBuilder si = new StringBuilder();
        for (int i = 0; i < expre.length(); i++)
        {
            si.append(expre.charAt(i));
        }
        StringBuilder sb=si.reverse();
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='(')
            {
                ss.append(')');
            }
            else if(sb.charAt(i)==')')
            {
                ss.append('(');
            }
            else {
                ss.append(sb.charAt(i));
            }
        }
        Stack<Character> stack = new Stack();
        StringBuilder gg=new StringBuilder();
        for(int i=0;i<ss.length();i++)
        {
            if(ss.charAt(i)>='A'&&ss.charAt(i)<='Z')
            {
                gg.append(ss.charAt(i));
            }
            else if(ss.charAt(i)=='(')
            {
                stack.push(ss.charAt(i));
            }
            else if(ss.charAt(i)==')')
            {
                while(!stack.isEmpty()&&stack.peek()!='(')
                {
                    gg.append(stack.pop());
                }
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else {
                if(stack.isEmpty()||getpriority(stack.peek())<=getpriority(ss.charAt(i)))
                {
                    stack.push(ss.charAt(i));
                }
                else {
                    while (!stack.isEmpty() && getpriority(stack.peek()) > getpriority(ss.charAt(i))) {
                        gg.append(stack.pop());

                    }
                    stack.push(ss.charAt(i));
                }

            }
        }
        while(!stack.isEmpty())
        {
            gg.append(stack.pop());
        }
        gg.reverse();
        System.out.print(gg.toString());
    }
}
