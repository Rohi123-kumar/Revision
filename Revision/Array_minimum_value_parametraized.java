package Revision;

import java.util.Scanner;

public class Array_minimum_value_parametraized 
{
	public void arrayMinimumValue(int a[])
	{		
		int min=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.println(min);
	}
	public static void main(String arg[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the input");
		int a[] = new int[5];
		for(int k=0; k<=4;k++)
		{
			a[k]=sc.nextInt();
		}
		Array_minimum_value_parametraized obj = new Array_minimum_value_parametraized();
		obj.arrayMinimumValue(a);
	}

}
