package training;
import java.util.*;
class IncorrectPasswordException extends RuntimeException
{
    IncorrectPasswordException(String er)
    {
        super(er);
    }
}
class InvalidPasswordException extends RuntimeException
{
    InvalidPasswordException(String er)
    {
        super(er);
    }
}
public class password {
    public static void main(String[] args) {
        String password = "System@123";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        if (pass.length() < 8) {
            throw new InvalidPasswordException("Password must at least contain 8 characters");
        }
        int up = 0;
        int sp = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i))) {
                up++;
            } else if (Character.isLowerCase(pass.charAt(i)) || Character.isDigit(pass.charAt(i))) {
                continue;
            } else {
                sp++;
            }
        }
        if (sp == 0 || up == 0) {
            throw new InvalidPasswordException("Invalid Password");
        }
        if (!pass.equals(password)) {
            throw new IncorrectPasswordException("Password is Incorrect");
        } else {
            System.out.print("Login successful");
        }
    }

}
