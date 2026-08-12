package training;
import java.util.*;
public class Throws {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n= sc.nextInt();
		int[] arr= new int[n];
		int i=0;
		while(i<n)
		{
			int k=sc.nextInt();
			if(k<0)
			{
				throw new RuntimeException("Invalid cost");
			}
			else if(k<100)
			{
				throw new IllegalArgumentException("Cost must be greater than 100");
			}
			else
			{
				arr[i]=k;
				i++;
			}
		}
		System.out.print("Program executed successfully");

	}

}
