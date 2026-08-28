package training;
interface car
{
	void drive();
}
interface tata extends car
{
	void make();
	void model();
}
interface tata_nano extends tata
{
	void year();
	void cost();
}
interface EV extends tata_nano
{
	void EVVehicle();
}
interface Diesel extends tata_nano
{
	void DieselVehicle();
}
interface Petrol extends tata_nano
{
	void PetrolVehicle();
}
class Owner implements EV,Diesel,Petrol
{
	String make;
	String model;
	int year;
	int cost;
	int type;
	public Owner(String make,String model,int year,int cost,int type)
	{
		this.make=make;
		this.model=model;
		this.year=year;
		this.cost=cost;
		this.type=type;
	}
	public void drive()
	{
		System.out.print("Drive"+"\n");
	}
	public void make()
	{
		System.out.print("Make of car: "+make+"\n");
	}
	public void model()
	{
		System.out.print("Model of car: "+model+"\n");
	}
	public void year()
	{
		System.out.print("Year of Manufacture: "+year+"\n");
	}
	public void cost()
	{
		System.out.print("Cost of price: "+cost+"\n");
	}
	public void EVVehicle()
	{
		System.out.print("EV Vehicle");
	}
	public void DieselVehicle()
	{
		System.out.print("Diesel Vehicle");
	}
	public void PetrolVehicle()
	{
		System.out.print("Petrol Vehicle");
	}
	public void typeVehicle()
	{
		if(type==1)
		{
			EVVehicle();
		}
		else if(type==2)
		{
			DieselVehicle();
		}
		else
		{
			PetrolVehicle();
		}
	}
	
}
public class Interface_class{
	public static void main(String[] args) {
		Owner car = new Owner("Tata","Punch",2020,500000,2);
		car.drive();
		car.make();
		car.model();
		car.year();
		car.typeVehicle();
	}
}
