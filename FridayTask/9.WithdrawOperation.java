
class BankAccount1 {
    static String BankName = "Mariamman Indian Bank";
    private long accountNumber;
    private String accountHolderName;
    private long mobileNumber;
    private String accountType;
    private double balance;

    BankAccount1(long accountNumber, String accountHolderName, long mobileNumber, String accountType, double balance) {
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
    public long getmobileNumber()
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
    public long getAccountNumber()
    {
        return accountNumber;
    }
    public void setMobileNumber(long num)
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
    public void withdraw(double amount)
    {
        if(amount<=0)
        {
            System.out.print("Invalid withdrawal amount\n");
        }
        else if(amount>=balance)
        {
            System.out.print("Insufficient Funds\n");
        }
        else
        {
            balance-=amount;
            System.out.print("Amount withdrawn Successfully\n");
        }
    }

}
public class Main {
    public static void main(String[] args) {
        BankAccount1 bn1= new BankAccount1(23431533415L,"John",4135224214L,"Savings",25000);
        BankAccount1 bn2 = new BankAccount1(324552432424L,"Julia",2131412453L,"Current",15000);
        bn1.withdraw(300);
        bn2.withdraw(40000);

    }
}
