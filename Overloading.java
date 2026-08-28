package training;
class Shapes
{
	public  void Area()
	{
		System.out.print("Area of shapes: ");
	}
	
}
class Square extends Shapes
{
	int sides;
	
	public void Area(int sides)
	{
		System.out.print("Area of Square: "+ sides*sides+"\n");
	}
}
class Circle extends Shapes
{
	
	public void Area(int radius)
	{
		System.out.print("Area of Circle: "+(22/7)*radius*radius+"\n");
	}
}
class Rectangle extends Shapes
{
	public void Area(int length, int breadth)
	{
		System.out.print("Area of Rectangle: "+length*breadth+"\n");
	}
}
class Triangle extends Shapes
{
	public void Area(int length,int base)
	{
		System.out.print("Area of Triangle: "+0.5*length*base+"\n");
	}
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		Square sq = new Square();
		Circle cir= new Circle();
		Triangle tro= new Triangle();
		rec.Area(5,6);
		cir.Area(4);
		tro.Area(3,5);
		sq.Area(6);
	}

}
