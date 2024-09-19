package Revision;

import java.util.Scanner;

public class Arrary_reverse_parametrized 
{
	public void arrayReverseParametrized(String a)
	{
		char ch[]=a.toCharArray();   //r  o  h  i  t
		String rev="";
		for(int i=a.length()-1;i>=0;i--)   // t i h o r
		{
			rev=rev+ch[i];
		}
		System.out.println(rev);
	}
	public static void main(String arg[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter input");   // rohit
		String a=sc.nextLine();
		Arrary_reverse_parametrized obj =new Arrary_reverse_parametrized();
		obj.arrayReverseParametrized(a);
	}
	

}
