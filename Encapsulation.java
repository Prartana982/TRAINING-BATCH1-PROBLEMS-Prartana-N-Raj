package training;
abstract class Employee
{
    private String name;
    private int salary;
    public String getName()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public int getSalary()
    {
        return salary;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    abstract double bonus_cal();
    abstract void display_All();
}
class Developer extends Employee
{
    @Override
    public double bonus_cal()
    {
        int salary=getSalary();
        double bonus=salary*(0.25);
        return bonus;
    }
    @Override
    public void display_All()
    {
        int salary=getSalary();
        String name=getName();
        double bonus=bonus_cal();
        System.out.print("Name: "+name+"\n");
        System.out.print("Salary: "+salary+"\n");
        System.out.print("Bonus: "+bonus+"\n");

    }
}
class Manager extends Employee
{
    @Override
    public double bonus_cal()
    {
        int salary= getSalary();
        double bonus=salary*(0.35);
        return bonus;
    }
    public void display_All()
    {
        int salary=getSalary();
        String name=getName();
        double bonus=bonus_cal();
        System.out.print("Name: "+name+"\n");
        System.out.print("Salary: "+salary+"\n");
        System.out.print("Bonus: "+bonus+"\n");
    }
}
class OfficeWorker extends Employee
{
    @Override
    public double bonus_cal()
    {
        int salary= getSalary();
        double bonus=salary*(0.15);
        return bonus;
    }
    public void display_All()
    {
        int salary=getSalary();
        String name=getName();
        double bonus=bonus_cal();
        System.out.print("Name: "+name+"\n");
        System.out.print("Salary: "+salary+"\n");
        System.out.print("Bonus: "+bonus+"\n");
    }
}
public class Encapsulation {

    public static void main(String[] args)
    {
        Developer d= new Developer();
        Manager m= new Manager();
        OfficeWorker ow= new OfficeWorker();
        d.setname("John");
        d.setSalary(12000);
        m.setname("Matthew");
        m.setSalary(40000);
        ow.setname("George");
        ow.setSalary(10000);
        d.display_All();
        m.display_All();
        ow.display_All();
    }


}
