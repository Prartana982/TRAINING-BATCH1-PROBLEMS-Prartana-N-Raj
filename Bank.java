
class BankAccount {
	static String BankName = "Mariamman Indian Bank";
	private long accountNumber;
	private String accountHolderName;
	private long mobileNumber;
	private String accountType;
	private double balance;

	BankAccount(int accountNumber, String accountHolderName, long mobileNumber, String accountType, double balance) {
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
		BankAccount bn1= new BankAccount(23431533415,"John",4135224214,"Savings",25000);
		BankAccount bn2 = new BankAccount(324552432424,"Julia",2131412453,"Current",15000);
		bn1.withdraw(300);
		bn2.withdraw(40000);

	}
}
