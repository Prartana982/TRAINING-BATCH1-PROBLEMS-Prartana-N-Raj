package training;
class parent
{
	void work()
	{
		System.out.print("Going to work\n");
	}
}
class child extends parent
{
	@Override
	void work()
	{
		System.out.print("Going to School\n");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c= new child();
		c.work();
		parent p= new parent();
		p.work();
	}

}
