/*WAP to find the Greater number between Two numbers*/

import java.util.*;
public class GreaterTwo
{
	public static void main(String args[])
	{
	   int a=10,b=20;
	   if(a>b)
	   {
		   System.out.println("a is Greater");
	   }
	   else
	   {
		   System.out.println("b is Greater");
	   }
	}
}


/*To take input from the user*/
import java.util.*;
public class GreaterTwo
{
	public static void main(String args[])
	{
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER TWO NUMBERS: ");
	a=sc.nextInt();
	b=sc.nextInt();
	if(a>b)
	{
		System.out.println("a is Greater");
	}
	else
	{
	    System.out.println("b is Greater");	
	}
	}
}