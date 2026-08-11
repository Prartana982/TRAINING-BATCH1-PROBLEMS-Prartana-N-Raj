package training;
abstract class Home
{
	void visible()
	{
		System.out.print("Sofa");
		System.out.print("TV");
		System.out.print("Fridge");
	}
	abstract void hide();
}
class me extends Home
{
	@Override
	void hide()
	{
		System.out.print("Hidden Function");
	}
}
class somebody extends me
{
	void hide()
	{
		System.out.print("Jewels");
	}
}
public class Abstraction {
	public static void main(String[] args) {
		somebody s = new somebody();
		s.hide();
	}

}
