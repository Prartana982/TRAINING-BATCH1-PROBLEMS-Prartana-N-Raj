package training;
import java.util.*;
public class Main {
	public static int sum1(int num)
	{
		int t=0;
		while(num!=0)
		{
			int k=num%10;
			t+=Math.pow(k, 2);
			num=num/10;
		}
		return t;
	}
	 
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int s= sc.nextInt();
		int n=sum1(s);
		while(n>10)
		{
			n=sum1(n);
		}
		if(n==1)
		{
			System.out.println("Number accepted");
		}
		else
		{
			System.out.println("Number not accepted");
		}
		sc.close();
		
}
}
