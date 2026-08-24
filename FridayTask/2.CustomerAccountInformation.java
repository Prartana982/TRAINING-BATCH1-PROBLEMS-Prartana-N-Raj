
class BankAccount1 {
    static String BankName = "Mariamman Indian Bank";
    private String accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;

    BankAccount1(String accountNumber, String accountHolderName, String mobileNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount1 bn1= new BankAccount1("23431533415","John","4135224214","Savings",25000);
        BankAccount1 bn2 = new BankAccount1("324552432424","Julia","2131412453","Current",15000);



    }
}
