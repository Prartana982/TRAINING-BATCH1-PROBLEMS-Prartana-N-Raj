import java.util.*;
class process extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Thread body: " + i + "\n");
        }
    }
}
    public class Multithreadingdemo {
    public static void main(String[] args)
    {
        process p1 = new process();
        p1.start();
        for(int i=0;i<5;i++)
        {
            System.out.print("Main body "+i+"\n");
        }
    }
}
