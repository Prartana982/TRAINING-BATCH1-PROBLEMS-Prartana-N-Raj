import java.util.*;
class order extends Thread{
    public void run() {
        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(4000);
            }catch(Exception e){}
            System.out.print("Order" + i + " being processed\n");
        }
    }
}
class kitchen extends Thread{
    public void run()
    {
        for(int i=1;i<6;i++)
        {
            try{
                Thread.sleep(6000);
            } catch(Exception e){}
            System.out.print("Kitchen is preparing Order "+i+"\n");
        }
    }
}
class delivery extends Thread{
    public void run()
    {
        for(int i=1;i<6;i++)
        {
            try{
                Thread.sleep(7000);
            }catch(Exception e){}
            System.out.print("Order "+i+" out for delivery\n");
        }
    }
}
public class Threadingclasstask {
    public static void main(String[] args) {
        order t1 = new order();
        kitchen t2 = new kitchen();
        delivery t3 = new delivery();
        t1.start();
        t2.start();
        t3.start();
    }
}
