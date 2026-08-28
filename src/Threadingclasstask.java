import java.util.*;
class Order extends Thread{
    public void run() {
        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(4000);
            }catch(Exception e){}
            System.out.print("Order " + i + " being processed\n");
        }
    }
}
class Kitchen extends Thread{
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
class Delivery extends Thread{
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
        Order t1 = new Order();
        Kitchen t2 = new Kitchen();
        Delivery t3 = new Delivery();
        t1.start();
        t2.start();
        t3.start();
    }
}
