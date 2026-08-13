package training;
class InsufficientBalanceException extends RuntimeException
{
	InsufficientBalanceException(String er)
	{
		super(er);
	}
}
class Account
{
	int balance;
	Account(int balance)
	{
		this.balance=balance;
	}
	void withdraw(int amount)
	{
		if(balance-amount<=0)
		{
			throw new InsufficientBalanceException("Insufficient funds");
		}
		else
		{
			balance-=amount;
			System.out.print("Amount has been withdrawn successfully.");
		}
	}
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac= new Account(500);
		ac.withdraw(600);
	}

}
