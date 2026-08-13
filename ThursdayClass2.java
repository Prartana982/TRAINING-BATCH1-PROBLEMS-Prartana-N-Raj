package training;
import java.util.*;
class InvalidMarkException extends RuntimeException
{
    InvalidMarkException(String er)
    {
        super(er);
    }
}
class InsufficientException extends RuntimeException
{
    InsufficientException(String er)
    {
        super(er);
    }
}
class ArrayException extends Exception
{
    ArrayException(String message)
    {
        super(message);
    }
}

public class ThursdayClass2 {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of marks: ");
            int n = sc.nextInt();
            if (n > 5) {
                throw new ArrayException("Array size should not be greater than 5");
            }
            int[] arr = new int[5];
            int i = 0;
            int sum1 = 0;
            while (i < 5) {
                arr[i] = sc.nextInt();
                if (arr[i] > 100) {
                    throw new InvalidMarkException("Mark must be between 0 and 100");
                } else if (arr[i] < 0) {
                    throw new InsufficientException("Mark must be greater than 0");
                } else {
                    sum1 += arr[i];
                    i++;
                }
            }
            System.out.print("Average marks: "+sum1/5);
        } catch (ArrayException e) {
            System.out.print(e.getMessage());
        }

    }
}
