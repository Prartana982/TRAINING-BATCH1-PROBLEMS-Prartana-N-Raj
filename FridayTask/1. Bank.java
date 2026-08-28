
class BankAccount1
{
    static String bankName = "Mariamman Indian Bank";
    private int accountNumber;
    private String accountHolderName;
    private int mobileNumber;
    private String accountType;
    private double balance;
    BankAccount1(int accountNumber,String accountHolderName,int mobileNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
    }
    }
public class Main {
    public static void main(String[] args) {
        BankAccount1 bn1= new BankAccount1("23431533415","John","4135224214");
        BankAccount1 bn2 = new BankAccount1("324552432424","Julia","2131412453");
        System.out.print("Bank Account 1: "+bn1.bankName+"\n");
        System.out.print("Bank Account 2: "+bn2.bankName);


    }
}
