
class BankAccount1 {
    static String BankName = "Mariamman Indian Bank";
    private int accountNumber;
    private String accountHolderName;
    private int mobileNumber;
    private String accountType;
    private double balance;

    BankAccount1(int accountNumber, String accountHolderName, int mobileNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    public String getAccountHolderName()
    {
        return accountHolderName;
    }
    public int getmobileNumber()
    {
        return mobileNumber;
    }
    public String getAccountType()
    {
        return accountType;
    }
    public double getBalance()
    {
        return balance;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public void setMobileNumber(int num)
    {
        this.mobileNumber = num;
    }
    public void deposit(double amount)
    {
        if(amount<=0)
        {
            System.out.print("Invalid Amount");
        }
        else {
            balance+=amount;
        }
    }

}
public class Main {
    public static void main(String[] args) {
        BankAccount1 bn1= new BankAccount1(23431533415,"John",4135224214,"Savings",25000);
        BankAccount1 bn2 = new BankAccount1(324552432424,"Julia",2131412453,"Current",15000);
        bn1.deposit(300);
        bn2.deposit(-200);
        System.out.print("Updated balance: "+bn1.getBalance());

    }
}
