package Revision;
import java.util.Scanner;
public class Array_maximum_value_non_parametrized_by_main 
{
	int n;
	public static void main(String arg[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of element of array");
		int n=sc.nextInt();
		System.out.println("Enter your input");
		int a[]=new int[n];
		//creating the array
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		//printing the array
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		int max=a[0];
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum value "+max);
	}
}
