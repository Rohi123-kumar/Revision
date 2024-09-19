package Revision;

import java.util.Scanner;

public class Calculator_Non_Parametrized 
{
	float a,b,c;
	public void add()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A ");
		int a=sc.nextInt();
		System.out.println("Enter the value of B ");
		int b=sc.nextInt();
		c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A ");
		int a=sc.nextInt();
		System.out.println("Enter the value of B ");
		int b=sc.nextInt();
		c=a-b;
		System.out.println(c);
	}
	public void mul()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A ");
		int a=sc.nextInt();
		System.out.println("Enter the value of B ");
		int b=sc.nextInt();
		c=a*b;
		System.out.println(c);
	}
	public void div()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A ");
		int a=sc.nextInt();
		System.out.println("Enter the value of B ");
		int b=sc.nextInt();
		c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Calculator_Non_Parametrized obj =new Calculator_Non_Parametrized();
		obj.add();
		obj.div();
		obj.mul();
		obj.sub();

	}
	
}
