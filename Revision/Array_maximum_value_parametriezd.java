package Revision;

import java.util.Scanner;

public class Array_maximum_value_parametriezd 
{ 

	public void arrayMaximumValueParametriezd(int n)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of element");
		n=sc.nextInt();
		int a[]=new int [n];
		System.out.println("Enter your element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
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
		System.out.println("maximum "+max);
	}
	public static void main(String arg[])
	{
		Array_maximum_value_parametriezd obj=new Array_maximum_value_parametriezd();
		obj.arrayMaximumValueParametriezd(0);
		
	}

}
