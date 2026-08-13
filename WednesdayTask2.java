package training;
abstract class BankAccount
{
	private int accountNumber;
	private String Holder;
	int balance;
	BankAccount(int accountNumber,String Holder, int balance)
	{
		this.accountNumber=accountNumber;
		this.Holder=Holder;
		this.balance=balance;
	}
	public void deposit(int amt)
	{
		balance+=amt;
		System.out.print("Amount deposited: "+amt+"\n");
	}
	abstract void withdraw(int amount);
	public String getName()
	{
		return Holder;
	}
	public void setName(String Holder)
	{
		this.Holder=Holder;
	}
	public int getNum()
	{
		return accountNumber;
	}
	public void setNum(int accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public void displayDetails()
	{
		System.out.print("Name: "+getName()+"\n");
		System.out.print("Account Number: "+getNum()+"\n");
		System.out.print("Balance: "+balance+"\n");
	}
}
class Savings extends BankAccount
{
	Savings(int AccountNumber, String holder, int balance)
	{
		super( AccountNumber,holder,balance);
	}
	public void withdraw(int amount)
	{
		if(balance-amount<1000)
		{
			System.out.print("Minimum balance of 1000 must be maintained. Invalid operation.\n");
		}
		else
		{
			balance-=amount;
			System.out.print("Amount withdrawn successfully.\n");
		}
	}
}
class Current extends BankAccount
{
	Current(int AccountNumber, String holder, int balance)
	{
		super(AccountNumber, holder, balance);
	}
	public void withdraw(int amount)
	{
		if(amount>5000)
		{
			System.out.print("Overdraft limit is 5000, amount can't be withdrawn.\n");
		}
		else {
			if(amount>balance)
			{
				System.out.print("Insufficient funds\n");
			}
			else
			{
				balance-=amount;
				System.out.print("Amount withdrawn successfully.\n");
			}
		}
	}
}
public class WednesdayTask2 {
	public static void main(String[] args) {
		Savings s = new Savings(123213144,"John",10000);
		Current c = new Current(231444122,"Jason",15000);
		s.displayDetails();
		c.displayDetails();
		s.withdraw(29000);
		s.withdraw(4000);
		c.withdraw(15000);
		c.withdraw(2000);

	}
}
