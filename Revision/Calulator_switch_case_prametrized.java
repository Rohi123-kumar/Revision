package Revision;

import java.util.Scanner;

public class Calulator_switch_case_prametrized 
{
	public void calculator(char operator, float a, float b, float c)
	{
		switch(operator)
		{
		case '+':
			c=a+b;
			System.out.println("The Addition of values " +c);
			break;
		case '-':
			c=a-b;
			System.out.println("The Subtract of values " +c);
			break;
		case '*':
			c=a*b;
			System.out.println("The multiplication of values " +c);
			break;
		case '/':
			c=a/b;
			System.out.println("The Division of values " +c);
			break;
			
		}
	}
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the value of A ");
		float a=sc.nextFloat();
		System.out.println("Please enter the value of B ");
		float b=sc.nextFloat();
		System.out.println("please Select '+' , '-' '*' '/' ");
		char operator =sc.next().charAt(0);
		Calulator_switch_case_prametrized obj=new Calulator_switch_case_prametrized();
		obj.calculator(operator, a, b, b);
	}

}
