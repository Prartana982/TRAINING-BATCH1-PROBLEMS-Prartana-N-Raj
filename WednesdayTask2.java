package training;
class BankAccount
{
	int balance=0;
	public void deposit(int amt)
	{
		balance+=amt;
		System.out.print("Amount deposited: "+amt+"\n");
	}
	public void deposit(int amt, String Description)
	{
		balance+=amt;
		System.out.print("Amount deposited: "+amt+"for "+Description+"successfully.\n");
	}
	public void deposit(int amt, String Description, int id_no)
	{
		balance+=amt;
		System.out.print("Account id: "+id_no+"\nAmount deposited: "+amt+"\nDescription: "+Description);
	}
			
}
class Savings extends BankAccount
{
	void interest_calculation()
	{
		double interest= balance*0.06;
		System.out.print("\nSavings account interest amount (6%): "+interest);
	}
}
class Current extends BankAccount
{
	void interest_calculation()
	{
		double interest=balance*0.02;
		System.out.print("\nCurrent account interest amount (2%): "+interest);
	}
}
public class WednesdayTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b= new BankAccount();
		b.deposit(5000);
		b.deposit(10000,"Salary Amount");
		b.deposit(3000,"Bonus",234);
		Savings s = new Savings();
		Current c = new Current();
		s.deposit(10000);
		c.deposit(12000);
		c.interest_calculation();
		s.interest_calculation();

	}

}
