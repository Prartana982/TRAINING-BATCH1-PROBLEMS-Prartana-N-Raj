import java.util.*;
@FunctionalInterface
interface Square
{
    void square(int a);
}
@FunctionalInterface
interface Circle
{
    void circle(int a, int b);
}
@FunctionalInterface
interface Rectangle
{
    void rectangle(int a, int b);
}
@FunctionalInterface
interface Triangle{
    void triangle(int a, int b);
}
public class lambdatask {
    public static void main(String[] args) {
        Square s = (int a) -> {
            System.out.print("Area of square: "+a * a+"\n");
        };
        s.square(5);
        Circle ci = (int c, int d) -> {
            System.out.print("Area of circle: "+3.14 * c * d+"\n");
        };
        ci.circle(6, 7);
        Rectangle r = (int a, int b) -> {
            System.out.print("Area of rectangle: "+a * b+"\n");
        };
        r.rectangle(8, 9);
        Triangle tr = (int a, int b) -> {
            System.out.print("Area of triangle: "+0.5 * a * b+"\n");
        };
        tr.triangle(8, 6);


    }



}
