import java.util.*;
class process extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(5000);
            }
            catch(Exception e){}
            System.out.print("Thread body: " + i + "\n");
        }
    }
}
class process1 extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++) {
            try {
                Thread.sleep(3000);
            }catch(Exception e){};
            System.out.print("New process thread " + i + "\n");
        }
    }
}
    public class Multithreadingdemo {
    public static void main(String[] args)
    {
        process p1 = new process();
        process1 p2 = new process1();
        p1.setName("New thread 1");
        p2.setName("New thread 2");
        System.out.print(p1.isAlive());
        System.out.print(p2.isAlive());
        p1.start();
        p2.start();
        for(int i=0;i<5;i++)
        {
            System.out.print("Main body "+i+"\n");
        }
    }
}
