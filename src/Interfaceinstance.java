import java.util.*;
interface acc
{
    default void add1() {
    }
    default void sub()
    {}

}
public class Interfaceinstance {
    public static void main(String[] args)
    {
    acc ac = new acc(){
        @Override
        public void add1()
        {
            System.out.print("Add the two values\n");
        }
        @Override
        public void sub()
        {
            System.out.print("Subtract the two values\n");
        }
    };
    ac.add1();
    ac.sub();
    }
}
