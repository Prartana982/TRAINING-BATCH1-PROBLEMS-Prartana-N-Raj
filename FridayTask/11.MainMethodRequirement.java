package training;
class BankAccount1
{
    static String BankName = "Mariamman Indian Bank";
    private String accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
    BankAccount1(String accountNumber,String accountHolderName,String mobileNumber,String accountType,double balance)
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.mobileNumber=mobileNumber;
        this.accountType=accountType;
        this.balance=balance;
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }
    public void setMobileNumber(String num)
    {
        this.mobileNumber = num;
    }
    public String getAccountHolderName()
    {
        return accountHolderName;
    }
    public String getmobileNumber()
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
    public void displayAccountDetails()
    {
        System.out.print("Account Holder Name: "+ getAccountHolderName()+"\n");
        System.out.print("Account Holder Mobile number: "+getmobileNumber()+"\n");
        System.out.print("Account Type: "+getAccountType()+"\n");
        System.out.print("Account Number: "+getAccountNumber()+"\n");
        System.out.print("Balance: "+getBalance()+"\n");
        System.out.println();
    }
}
public class FridayClassTask {
    public static void main(String[] args) {
        BankAccount1 acc1 = new BankAccount1("234251523343", "John", "8799897876", "Savings", 34000);
        BankAccount1 acc2 = new BankAccount1("242415241524", "Julia", "1214213444", "Current", 30000);
        System.out.print(acc1.BankName);
        System.out.print(acc2.BankName);
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
    }
}