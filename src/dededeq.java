import java.util.*;
class Printer{
    String name;
    String task;
    Printer(String name, String task)
    {
        this.name=name;
        this.task=task;
    }
    void print_task()
    {
        System.out.print("Printing :"+task+"\n");
    }
    @Override
    public String toString()
    {
        return (name+" "+task);
    }
}
public class dededeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Printer> qu = new LinkedList<>();
        Printer p1 = new Printer("P1", "PDF");
        Printer p2 = new Printer("P2", "Article");
        Printer p3 = new Printer("P3", "Image");
        Printer p4 = new Printer("P4", "Research Paper");
        Printer p5 = new Printer("P5", "Document");
        int n = 5;
        while (n > 0) {
            System.out.print("Enter choice order(one by one): ");
            int r=sc.nextInt();
            switch(r)
            {
                case 1: {
                    if (!qu.contains(p1)) {
                        qu.addFirst(p1);
                    }
                    n--;
                    break;
                }
                case 2:
                {
                    if(!qu.contains(p2))
                    {
                        qu.addFirst(p2);
                    }

                    n--;
                    break;
                }
                case 3:
                {
                    if(!qu.contains(p3))
                    {
                        qu.addFirst(p3);
                    }

                    n--;
                    break;
                }
                case 4:
                {
                    if(!qu.contains(p4))
                    {
                        qu.addFirst(p4);
                    }

                    n--;
                    break;
                }
                case 5:
                {
                    if(!qu.contains(p5))
                    {
                        qu.addFirst(p5);
                    }

                    n--;
                    break;
                }

            }


        }
        System.out.print(qu);

    }
}
