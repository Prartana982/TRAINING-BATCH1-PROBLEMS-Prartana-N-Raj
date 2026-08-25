import java.util.*;

public class Stack_reverse {
    public static  String reversed(String a)
    {
        StringBuilder sb= new StringBuilder();
        for(int i=a.length()-1;i>=0;i--)
        {
            sb.append(a.charAt(i));
        }
        return sb.toString();
    }
        public static void main(String[] args)
        {
            Scanner sc =  new Scanner(System.in);
            int size = sc.nextInt();
            sc.nextLine();
            String[] arr = new String[size];
            Stack<String> st = new Stack<>();
            int k=0;
            while(k<size)
            {
                arr[k]=sc.nextLine();
                k++;
            }
            for(int i=size-1;i>=0;i--)
            {
                st.push(reversed(arr[i]));
            }
            while(!st.isEmpty())
            {
                System.out.print(st.pop()+" ");
            }

        }
    }


