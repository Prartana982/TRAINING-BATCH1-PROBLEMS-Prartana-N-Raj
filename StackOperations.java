package training;
import java.util.*;


public class StackOperations {
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<>();
        System.out.print("STACK OPERATIONS\n");
        System.out.print("1.PUSH\n");
        System.out.print("2.POP\n");
        System.out.print("3.PEEK\n");
        System.out.print("4.IsEmpty\n");
        System.out.print("5.Size\n");
        System.out.print("6.Display\n");
        System.out.print("7.Exit\n");
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        while(r!=-1)
        {

            if(r==1)
            {
                int inp=sc.nextInt();
                st.push(inp);
            }
            else if(r==2)
            {
                System.out.print(st.pop());
            }
            else if(r==3)
            {
                System.out.print(st.peek());
            }
            else if(r==4)
            {
                System.out.print(st.isEmpty());
            }
            else if(r==5)
            {
                System.out.print(st.size());
            }
            else if(r==6)
            {
                System.out.print(st);
            }
            else {
                System.out.print("Invalid choice");
            }
            r=sc.nextInt();
        }

    }
}

