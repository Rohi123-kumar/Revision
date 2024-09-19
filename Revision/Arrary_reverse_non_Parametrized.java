package Revision;

import java.util.Scanner;

public class Arrary_reverse_non_Parametrized 
{
	String a;
	public void stringReverse() 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value");
		String a=sc.nextLine();
		char arr[]=a.toCharArray();
		String rev="";
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+arr[i];
		}
		System.out.println(rev);
		
		
	}
	public static void main(String[] args) 
	{
		Arrary_reverse_non_Parametrized obj =new Arrary_reverse_non_Parametrized();
		obj.stringReverse();
	}

}
