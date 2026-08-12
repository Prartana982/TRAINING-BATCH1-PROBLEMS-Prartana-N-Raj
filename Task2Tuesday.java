package training;
import java.util.*;
abstract class Vehicle
{
	int VehicleNumber;
	String brand;
	float baseRate; 
	Vehicle(int VehicleNumber,String brand,float baseRate)
	{
		this.VehicleNumber=VehicleNumber;
		this.brand=brand;
		this.baseRate=baseRate;
	}
	abstract int calculateRentalCost(int days);
}
interface Insurable
{
	abstract void getInsuranceCost();
}
class Car extends Vehicle implements Insurable
{
	Car(int VehicleNumber,String brand,int baseRate)
	{
		super(VehicleNumber,brand,baseRate);
	}
	int calculateRentalCost(int days)
	{
		int total=days*3000;
		return total;
	}
	public void getInsuranceCost()
	{
		System.out.print("Insurance cost for Car: "+25000+"\n");
	}
}
class Bike extends Vehicle
{
	Bike(int VehicleNumber,String brand,int baseRate)
	{
		super(VehicleNumber,brand,baseRate);
	}
	int calculateRentalCost(int days)
	{
		int total= days*2000;
		return total;
	}
}
class Truck extends Vehicle implements Insurable
{
	Truck(int VehicleNumber,String brand,int baseRate)
	{
		super(VehicleNumber,brand,baseRate);
	}
	int calculateRentalCost(int days)
	{
		int tc= days*3500;
		return tc;
	}
	public void getInsuranceCost()
	{
		System.out.print("Insurance Cost for Truck: "+50000+"\n");
	}
}
class RentalAgency
{
	List<Vehicle> list= new ArrayList<>();
	void add(Vehicle v)
	{
		list.add(v);
	}
	void display()
	{
		for(Vehicle v:list) {
			System.out.print("Vehicle Number : "+v.VehicleNumber+"\n");
			System.out.print("Brand: "+v.brand+"\n");
			System.out.print("Base rent: "+v.baseRate+"\n");
			System.out.print("Total days: ");
			Scanner sc = new Scanner(System.in);
			int days=sc.nextInt();
			System.out.print("Total rent: "+v.calculateRentalCost(days)+"\n");

		}
	}
}
public class Task2Tuesday {
	public static void main(String[] args) {
		Bike b = new Bike(324,"Apache",2000);
		Car c = new Car(4565,"Climber",3000);
		Truck t = new Truck(7787,"Maruthi",3500);
		RentalAgency re= new RentalAgency();
		c.getInsuranceCost();
		t.getInsuranceCost();
		re.add(b);
		re.add(c);
		re.add(t);
		re.display();


	}

}
