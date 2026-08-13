package training;
import java.util.*;
public class Exception {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr= new int[3];
        String c= null;
        try {
            System.out.print(a / b+"\n");
            System.out.print(arr[1]+"\n");
            System.out.print(c);
        } catch (ArithmeticException e) {
            System.out.print("Division by 0 is not possible\n");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.print("Array Index exceeded bounds\n");
        }
        catch(NullPointerException e)
        {
            System.out.print("No value is assigned to this\n");
        }
        finally
        {
            System.out.print("Program executed");
        }
        System.out.print("Code is Executed\n");
    }
}
