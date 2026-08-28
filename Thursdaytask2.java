package training;
import java.util.*;
public class Thursdaytask2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int in = 0;
        while (in < n) {
            int f = sc.nextInt();
            list.add(f);
            in++;
        }
        int i=0;
        int j=n-1;
        while(i<n&&j>=0)
        {
            while(i<n&&!(list.get(i)%10==0))
            {
                i++;
            }
            while(j>=0&&list.get(j)%10==0)
            {
                j--;
            }
            int a= list.get(i);
            int b= list.get(j);
            list.set(j,a);
            list.set(i,b);
            i++;
            j--;
        }

        System.out.print(list);
    }
}
