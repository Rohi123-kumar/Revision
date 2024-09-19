package Revision;

import java.util.Scanner;

public class Array_minimum_value_non_parametrized 
{
	int n;
	public void arrayMinimumVlaue()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of element wants to store");
		 n=sc.nextInt();
		System.out.println("Enter your input");
		int a[]=new int[n];
		//creating the array
		for (int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are: ");
		// accessing array elements using the for loop  
		for (int i = 0; i <n; i++) 
		{
		    System.out.println(a[i]);
		}
		//loop for minimum element
		System.out.println("Minimum Element of array");
		int min=a[0];
		for (int i=0;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) 
	{
		Array_minimum_value_non_parametrized obj=new Array_minimum_value_non_parametrized();
		obj.arrayMinimumVlaue();
	}
	

}
