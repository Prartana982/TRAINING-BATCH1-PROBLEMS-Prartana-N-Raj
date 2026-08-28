import java.util.*;
class process extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Thread body: " + i + "\n");
        }
    }
}
class process1 extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++) {
            System.out.print("New process thread " + i + "\n");
        }
    }
}
    public class Multithreadingdemo {
    public static void main(String[] args)
    {
        process p1 = new process();
        process1 p2 = new process1();
        p1.start();
        p2.start();
        for(int i=0;i<5;i++)
        {
            System.out.print("Main body "+i+"\n");
        }
    }
}
